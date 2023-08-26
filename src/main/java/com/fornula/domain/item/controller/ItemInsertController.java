package com.fornula.domain.item.controller;

 

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.iteminsert.ChangePhotoIdx;
import com.fornula.domain.item.service.ItemInsertService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/item")
public class ItemInsertController {
	private final ItemInsertService itemInsertService;
	private final WebApplicationContext context;
//	이 필드는 밑 메소드에서 사진 업로드 기능을 사용해 itemFileName을 받은 뒤 PHOTO 테이블에 행을 삽입할 때 사용하기 위해서 저장한 것 -> mapper.xml에서 SQL 수정도 해야함
	private String itemFileName;
//	이 필드는 밑 메소드에서 상품등록에서 사용된 itemIdx를 밑 밑 메소드의 사진등록에서도 사용하기 위한 것 -> mapper.xml에서 SQL 수정도 해야함
	private int itemIdx;
	
//	상품등록폼
	@GetMapping("/add")
	public String add() {
		log.info("ItemInsertController 클래스의 add 메소드 실행 -> 상품 등록 페이지로 이동");
		return "item-add";
	}
	
//	상품등록(photoIdx는 임시값 부여)
	@PostMapping("/add")
	public String insert(@ModelAttribute Item itemForm,RedirectAttributes redirectAttributes) {
		
		log.info("Item테이블에 행 삽입(photoIdx는 임시값임)");
		
		Item item = new Item();
		
		item.setExpertIdx(itemForm.getExpertIdx());
		item.setPrice(itemForm.getPrice());
		item.setItemName(itemForm.getItemName());
		item.setItemContent(itemForm.getItemContent());
		item.setCategoryIdx(itemForm.getCategoryIdx());
		item.setPhotoIdx(item.getPhotoIdx());
		
		log.info("Item테이블에 행 삽입된 내용 {}",item);
		
		int result=itemInsertService.addItem(item);
		
		if(result==0) {
			redirectAttributes.addFlashAttribute("message","상품등록에 실패하였습니다");
			return "redirect:/item/add";
		}
		
		return "/item";
	}
//	임시 photoIdx를 진짜 photoIdx로 바꾸기 위한 준비작업(itemIdx뽑아내기)
//	-> itemIdx를 뽑아내기 위해서 전문가의 로그인 정보(expertIdx)가 저장된 SessionConst를 사용한 상수가 있어야 하는거아님? 
//	(throws의 대상인 Exception 페이지는 그냥 간단한 메세지만 넣고 만들어야지)
//	-> -> 이거 하려면 Login_Member처럼 Login_Expert도 만들어야하는거아님?
	/*
	@PostMapping("/select-itemIdx")
	public int selectItemIdx(@ModelAttribute ChangePhotoIdx changePhotoIdx, HttpSession session) throws MypageIdExcepion{
		Member member=(Member)session.getAttribute(SessionConst.Login_Member);
		int findExpertIdx;
		int useExpertIdx;
		int findItemIdx;
		
		if(member.getMemberStatus()==2) {
			log.info("sessionMemberStatus={}",member.getMemberStatus());
			findExpertIdx=member.getMemberIdx();
			
		} 
		
		이거는 어케해야하지.. 
		
		return "board";
	}
	*/
	
//	사진(png 파일)을 받는 기능+PHOTO 테이블에 행 추가, 예외 클래스 필요하면 만들기
	@PostMapping("/addphoto")
	public String addphoto(@ModelAttribute Photo photo, @RequestParam MultipartFile uploadFile, Model model) throws IOException {
		
		log.info("아이템등록시 필요한 사진 업로드");
		log.info("{uploadFile = {}",uploadFile);
		log.info("photo = {}",photo);
//		uploadFile이 PNG가 아닐 경우 / #/png 이게 맞나?
		if(!uploadFile.getContentType().equals("/png")) {
			log.info("업로드 파일 검사중...");
			model.addAttribute("message","PNG 파일만 업로드 해주세요");
			return "item-add";
		} else if(uploadFile.isEmpty()) {
			model.addAttribute("message","상품 등록시엔 최소 1개 이상의 PNG 파일이 필요합니다");
			return "item-add";
		}
		
//		uploadFile의 경로를 저장하기 위한 식
		String uploadDirectory=context.getServletContext().getRealPath("/resources/upload");
		log.info("filepath="+uploadDirectory);
//		uploadFile의 파일이름(PHOTO 테이블의 itemFileName)을 저장하기 위한 식
		itemFileName=UUID.randomUUID().toString()+"_"+uploadFile.getOriginalFilename();
		log.info("itemFileName="+itemFileName);
		photo.setItemfileName(uploadDirectory);
		
//		근데 이제 photo.setItemFileName은 itemFileName만 넣는거고 이제 PHOTO 테이블에 들어가야 하는 다른 컬럼값들도 여기다 작성해야 하나?
		photo.setPhotoIdx(photo.getPhotoIdx());
		photo.setItemIdx(itemIdx);
		
		try {
			uploadFile.transferTo(new File(uploadDirectory,itemFileName));
			System.out.println("파일 업로드 성공");
		} catch (IOException e) {
			System.out.println("파일 업로드 실패");
			e.printStackTrace();
		}
		
		itemInsertService.addPhoto(photo);
		
		return "item-add";
	}	
	
//	임시값으로 줘놓은 ITEM 테이블의 photo_idx를 이제 PHOTO 테이블의 photo_idx로 바꾸기
	@PostMapping(value="/addphotoidx")
	public String modifyItemPhoto(@RequestParam int itemIdx){
		log.info("ITEM 테이블에 임시값으로 줘 놓은 photoIdx를 진짜 photoIdx로 부여하는 작업");
		
		try {
			itemInsertService.modifyItemPhoto(itemIdx);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "item-board";
	}	
}
