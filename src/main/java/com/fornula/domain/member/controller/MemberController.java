package com.fornula.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	// 시험용
	
	@GetMapping("/home")
	public String home() {
		return "main";
	}
}