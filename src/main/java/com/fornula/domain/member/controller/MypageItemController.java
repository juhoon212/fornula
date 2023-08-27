package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.dto.mypage.ItemExpert;
import com.fornula.domain.member.service.MypageItemService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MypageItemController {

	private final MypageItemService service;
	
	@GetMapping("/mypagePurchase")
	   public String mypagePurchase() {
		   return "mypage-purchase";
	   }
	
	@PostMapping("/mypagePurchase")
	public String mypagePurchase(@ModelAttribute InfoCategory category, HttpSession session) {
	
		Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		
		
	    Purchase purchaseMypage =service.mypageItemPurchase(member.getMemberIdx());
	    ItemExpert itemMypage =service.mypageItemExpert(member.getMemberIdx());
		   
	    session.setAttribute("member", member);
	    session.setAttribute("purchaseMypage", purchaseMypage);
	    session.setAttribute("itemMypage", itemMypage);
	   
		
		   
		   return "mypage-info"; 
	}
}