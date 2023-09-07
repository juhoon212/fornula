package com.fornula.domain.item.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.ItemPayment;
import com.fornula.domain.item.service.ItemPaymentService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PaymentController {

	 private final ItemPaymentService service;
	 
		@GetMapping("/payment/{itemIdx}")
		public String getPayment(@PathVariable Integer itemIdx, Model model) {
			
			ItemPayment payment = service.itemPayment(itemIdx);
			
			String originalFileName = extractPhoto(payment);
			
			model.addAttribute("itemIdx", itemIdx);
			model.addAttribute("payment", payment);
			model.addAttribute("originalFileName", originalFileName);
			
			return "payment"; 
		}

		
		
		@PostMapping("/payment/{itemIdx}")
		public String postPayment(@PathVariable Integer itemIdx,
				RedirectAttributes redirectAttributes) {
		
			redirectAttributes.addAttribute("itemIdx", itemIdx);
			
			  
			return "redirect:/paymentSuccess/{itemIdx}"; 
		}
		
		
		private String extractPhoto(ItemPayment payment) {
			int pos = payment.getItemfileName().lastIndexOf("_");
			String originalFileName = payment.getItemfileName().substring(pos+1);
			return originalFileName;
		}
				
	}


