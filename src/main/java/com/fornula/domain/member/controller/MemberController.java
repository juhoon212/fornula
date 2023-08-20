package com.fornula.domain.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.fornula.domain.util.session.SessionConst;

@Controller
public class MemberController {
	
	// 시험용
	
	@GetMapping("/home")
	public String home() {
		return "main";
	}
	
	
	
}
