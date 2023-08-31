package com.fornula.domain.member.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MypageNopurchase {
	
	@GetMapping("/mypage-nopurchase")
	public String failPurchase() {
		return "mypage-nopurchase";
	}
}
