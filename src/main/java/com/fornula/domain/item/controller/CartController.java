package com.fornula.domain.item.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.service.CartService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequiredArgsConstructor
public class CartController {
	private final CartService cartService;
	
	@GetMapping("/cart")
	public String getCart(HttpSession session
			, @ModelAttribute CartList cart
			, Model model) {
		
		String originalFileName; // 원본 파일 이름
		int pos;
		
		// 세션에서 memberIdx 추출
		Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		int memberIdx = member.getMemberIdx();
		log.info("getmapping의 memberIdx:{}", memberIdx);
		
		List<CartList> cartLists = cartService.getCartList(memberIdx);
		
		for(CartList cartList : cartLists) {
			pos = cartList.getItemfileName().lastIndexOf("_");
			originalFileName = cartList.getItemfileName().substring(pos + 1);
			
			cartList.setItemfileName(originalFileName);
		}
		
		model.addAttribute("cartList",cartLists);
		log.info("cartList:{}",cartLists);

		return "cart";

	}
}
