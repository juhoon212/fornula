package com.fornula.domain.item.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemPayment.ItemPayment;
import com.fornula.domain.item.service.ItemPaymentService;
import com.fornula.domain.item.service.ItemPaymentSuccessService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PaymentSuccessController {

	 private final ItemPaymentSuccessService service;
	 
		
		@GetMapping("/paymentSuccess/{itemIdx}")
		public String postPayment(@PathVariable Integer itemIdx, HttpSession session) {
			
			log.info("itemIdx = {}", itemIdx);
			
			Member member = (Member)session.getAttribute(SessionConst.Login_Member);
			log.info("member.getId() = {}", member.getId());
			
			//sales 테이블에서 오류남.
			//service.itemPaymentSuccess(itemIdx);
			//nullpointerexcepion 에러 잡기(디비값)
		    service.itemPaymentSuccess(itemIdx,member.getMemberIdx());
			 
		    
		    return "redirect:/payment-success"; 
		}
		
		
	}


