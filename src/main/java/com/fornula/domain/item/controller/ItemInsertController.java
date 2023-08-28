package com.fornula.domain.item.controller;

 

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.fornula.domain.item.dto.ItemForm;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.PhotoForm;
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

	@GetMapping("/add")
	public String add() {
		return "item-add";
	}
	
	@PostMapping("/add")
	public String insert(@ModelAttribute ItemForm itemForm,RedirectAttributes redirectAttributes) {
		
		
		
		log.info("Item테이블에 행 삽입(photoIdx는 임시값임)");
		
		Item item = new Item();
		
		item.setExpertIdx(itemForm.getExpertIdx());
		item.setPrice(itemForm.getPrice());
		item.setItemName(itemForm.getItemName());
		item.setItemContent(itemForm.getItemContent());
		item.setCategoryIdx(itemForm.getCategoryIdx());
		
		log.info("Item테이블에 행 삽입된 내용 {}",item);
		
		int result=itemInsertService.addItem(item);
		
		if(result==0) {
			redirectAttributes.addFlashAttribute("message","상품등록에 실패하였습니다");
			return "redirect:/item/add";
		}
		
		redirectAttributes.addAttribute("itemIdx", item.getItemIdx());
		
		return "redirect:/item/photo/add/{itemIdx}/"; // 등록한 상품 상세페이지로 이동 
	}
	
	@GetMapping("/photo/add/{itemIdx}")
	public String addPhoto(@PathVariable String itemIdx, Model model) {
		
		model.addAttribute("itemIdx", itemIdx);
		
		return "add-photo";
	}
	
	
	@PostMapping("/photo/add/{itemIdx}")
	public String addPhotoPost( @RequestParam(required = false) MultipartFile multipartFile,
								Model model, 
								@PathVariable Integer itemIdx, 
								RedirectAttributes redirectAttributes) throws IOException {
		
			if(multipartFile.isEmpty() ||!multipartFile.getContentType().equals("image/png")) {
				redirectAttributes.addFlashAttribute("message", "잘못된 파일입니다");
				redirectAttributes.addAttribute("itemIdx", itemIdx);
				return "redirect:/item/photo/add/{itemIdx}";
			}
			
//			uploadFile의 경로를 저장하기 위한 식
			String uploadDirectory=context.getServletContext().getRealPath("/resources/upload");
			log.info("filepath = {}", uploadDirectory);
//			uploadFile의 파일이름(PHOTO 테이블의 itemFileName)을 저장하기 위한 식
			String uploadFileName = UUID.randomUUID().toString()+"_"+ multipartFile.getOriginalFilename();
			
			Photo itemPhoto = new Photo();
	
			itemPhoto.setItemfileName(uploadFileName);
			itemPhoto.setItemIdx(itemIdx);
			
			multipartFile.transferTo(new File(uploadDirectory , uploadFileName));
			
			// DB에 photo 객체 저장
			itemInsertService.addPhoto(itemPhoto);
		
		
		redirectAttributes.addAttribute("itemIdx", itemIdx);
		
		
		return "redirect:/board/{itemIdx}";
	}	
}
