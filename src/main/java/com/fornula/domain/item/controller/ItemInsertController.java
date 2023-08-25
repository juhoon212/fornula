package com.fornula.domain.item.controller;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.iteminsert.ChangePhotoIdx;
import com.fornula.domain.item.service.ItemInsertService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item-")
@RequiredArgsConstructor
@Slf4j
public class ItemInsertController {
	private final ItemInsertService itemInsertService;
	private final Expert expert;
	
//	상품등록폼
	@GetMapping("insert")
	public String insert() {
		log.info("ItemInsertController 클래스의 insert 메소드 실행");
		return "insert";
	}
//	상품등록(photoIdx는 임시값 부여)
	@RequestMapping(value="/iteminsert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Item item,RedirectAttributes redirectAttributes) {
		
		log.info("Item테이블에 행 삽입");
		
		item=new Item();
		
		item.setExpertIdx(item.getExpertIdx());
		item.setPrice(item.getPrice());
		item.setItemName(item.getItemName());
		item.setItemContent(item.getItemContent());
		item.setCategoryIdx(item.getCategoryIdx());
		item.setPhotoIdx(item.getPhotoIdx());
		
		int result=itemInsertService.addItem(item);
		
		if(result==0) {
			redirectAttributes.addFlashAttribute("message","상품등록에 실패하였습니다");
			return "redirect:/item-/insert";
		}
		
		return "/board";
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
		
		
		return "board";
	}
	*/
}
