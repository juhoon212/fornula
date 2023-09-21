package com.fornula.domain.item.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.ItemPayment;
import com.fornula.domain.item.service.ItemPaymentService;
import com.fornula.domain.item.service.ItemPaymentSuccessService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.payment.dto.Payments;
import com.fornula.domain.payment.service.PaymentsService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PaymentController {

	 private final ItemPaymentService service;
	 private final PaymentsService paymentService;
	
	 
		@GetMapping("/payment/{itemIdx}")
		public String getPayment(@PathVariable Integer itemIdx, Model model) {
			
			log.info("itemIdx = {}", itemIdx);
			ItemPayment payment = service.itemPayment(itemIdx);
			log.info("payment 메소드 itemIdx = {}", payment.getItemIdx());
			String originalFileName = extractPhoto(payment);
			
			model.addAttribute("itemIdx", itemIdx);
			model.addAttribute("payment", payment);
			model.addAttribute("originalFileName", originalFileName);
			
			return "payment"; 
		}

		/*
		
		@PostMapping("/payment/{itemIdx}")
		public String postPayment(@PathVariable Integer itemIdx,
				RedirectAttributes redirectAttributes) {
		
			redirectAttributes.addAttribute("itemIdx", itemIdx);
			
			  
			return "redirect:/paymentSuccess/{itemIdx}"; 
		}
		*/
		
		@PostMapping("/payment")
		@ResponseBody
		public String pay(@RequestBody Payments payment, HttpSession session) {
			//결제 관련 API를 이용하기 전에 결제 금액 검증을 위해 세션에 주문번호(이름)와 결제금액(값)을 저장
			log.info("payment 실행");
			log.info("pay 메소드 itemIdx = {}", payment.getItemIdx());
			session.setAttribute(payment.getMerchantUid(), payment.getAmount());
			//redirectAttributes.addAttribute("itemIdx", itemIdx);
			// ,@RequestParam Integer itemIdx
			 //,RedirectAttributes redirectAttributes
			return "ok";	 
		}
		
		//결제 후 결제 금액을 검증하여 응답하는 요청 처리 메소드
		
		
		@PostMapping("/complete")
		@ResponseBody
		public String complete(@RequestBody Payments payment, HttpSession session, Model model) {
			
			//접근 토큰을 발급받아 저장
			String accessToken=paymentService.getAccessToken(payment);
			
			//토큰과 결제고유값을 전달하여 API를 이용하여 결제정보를 반환받아 저장
			Payments returnPayment=paymentService.getPayment(accessToken, payment.getImpUid());
			
			//세션에 저장된 결제 금액을 반환받아 저장
			Long beforeAmount=(Long)session.getAttribute(payment.getMerchantUid());
			
			log.info("isSame ? = {}", beforeAmount.equals(returnPayment.getAmount()));
			
			session.removeAttribute(payment.getMerchantUid());
			
			Member member = (Member)session.getAttribute(SessionConst.Login_Member);
			
			//결제된 결제금액을 반환받아 저장 
			Long amount=returnPayment.getAmount();
			//log.info("itemIdx = {}", returnPayment.getItemIdx());
			
			if(beforeAmount.equals(amount)) {//검증 성공
				
				paymentService.PaymentSalesSuccess(payment.getItemIdx());//테이블에 결제정보 삽입 처리
				//log.info("returnPayment.getItemIdx() = {}", returnPayment.getItemIdx());
				
				paymentService.PaymentPurchaseSuccess(payment.getItemIdx(),member.getMemberIdx());//테이블에 결제정보 삽입 처리
				//log.info("member.getMemberIdx() = {}", member.getMemberIdx());
				model.addAttribute("message", "결제 성공하였습니다.");
				return "success";
			} else {//검증 실패(결제 금액 불일치) - 위변조된 결제
				paymentService.cancelPayment(accessToken, returnPayment);
				model.addAttribute("message", "결제에 실패하였습니다.");
				return "forgery";
			}
		}
		
		@GetMapping("/common-success")
		public String commonSuccess() {
			
			return "/common-success"; 
		}
	

		
		private String extractPhoto(ItemPayment payment) {
			int pos = payment.getItemfileName().lastIndexOf("_");
			String originalFileName = payment.getItemfileName().substring(pos+1);
			return originalFileName;
		}
		

				
	}


