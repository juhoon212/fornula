package com.fornula.domain.item.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.item.dto.itemPayment.ItemPayment;
import com.fornula.domain.item.service.ItemPaymentService;
import com.fornula.domain.item.service.ItemPaymentSuccessService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PaymentSuccessController {

	 private final ItemPaymentSuccessService service;
	 
		@GetMapping("/paymentSuccess")
		public String payment() {
		return "payment-success";
		}
		
		@GetMapping("/paymentSuccess/{itemIdx}")
		public String getPayment(@ModelAttribute ItemPayment payment, HttpSession session) {
		
			Member member = (Member)session.getAttribute(SessionConst.Login_Member);
			
			///itemIdx 받아서 객체만든다음
			   //Member joinMember = service.mypageInfoService(member.getMemberIdx());
				//객체로 서비스 메소드 호출
				   //Member joinMember = service.mypageInfoService(member.getMemberIdx());   
				
	
		    //객체.getidx,객체,itemidx넣어서 서비스 메소드 호출
			
			  
			   return "payment-success"; 
		}
		
		@PostMapping("/paymentSuccess/{itemIdx}")
		public String postPayment(@ModelAttribute ItemPayment payment, HttpSession session) {
		
			Member member = (Member)session.getAttribute(SessionConst.Login_Member);
			
			///itemIdx 받아서 객체만든다음
			   //Member joinMember = service.mypageInfoService(member.getMemberIdx());
				//객체로 서비스 메소드 호출
				   //Member joinMember = service.mypageInfoService(member.getMemberIdx());   
				
	
		    //객체.getidx,객체,itemidx넣어서 서비스 메소드 호출
			
			  
			   return "payment-success"; 
		}
		
		
	}


