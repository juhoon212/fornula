package com.fornula.domain.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.service.MypageItemService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MypageItemController {

	private final MypageItemService itemService;
	
	
	@GetMapping("/mypagePurchase")
	public String mypagePurchase(HttpSession session, Model model) {
	
		Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		
		

//	  Purchase purchaseMypage =itemService.mypageItemPurchase(member.getMemberIdx());
	 
	   // ItemExpert itemMypage =service.mypageItemExpert(member.getMemberIdx());
		   
	    //model.addAttribute("member", member);
	    //model.addAttribute("purchaseMypage", purchaseMypage);
	   // session.setAttribute("itemMypage", itemMypage);
	    

		List<Itempurchase> Itempurchase =itemService.mypageItemPurchase(member.getMemberIdx());
		   
	    model.addAttribute("member", member);
	    model.addAttribute("Itempurchase", Itempurchase);
	     
		return "mypage-purchase"; 
	}
}