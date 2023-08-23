package com.fornula.domain.expert.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertJoinService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class ExpertJoinController {
	private final ExpertJoinService expertJoinService;
	@GetMapping("/expertjoin")
	public String join() {
		return "expert-join";
	}
	
	@PostMapping("/expertjoin")
	public String join(@ModelAttribute Expert expert, Model model) {
		//중복됐을 경우 예외 던지기
		expertJoinService.addExpertInfo(expert);
		
		//예외 처리 
		//model.addAttribute("message","이미 전문가로 등록되었습니다.");

		//만약에 로그인사용자가 전문가가 아닐경우에만 등록이 가능
		return "main";
	}
	
}
