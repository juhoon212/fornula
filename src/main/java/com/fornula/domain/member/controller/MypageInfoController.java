package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.member.dto.mypage.InfoInterest;

@Controller
public class MypageInfoController {
  
	@GetMapping("/mypageInfo")
	public String info() {
	return "mypage-info";
	}
	
	@PostMapping("/mypageInfo")
	public String info(@ModelAttribute InfoInterest interest, HttpSession session) {
	return "mypage-info";
	}
}
