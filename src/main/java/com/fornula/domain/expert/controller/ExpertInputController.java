package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.expert.service.ExpertInputService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/expert")
@Slf4j
public class ExpertInputController {
	private final ExpertInputService expertInputService;
	
	@GetMapping("/modify")
	public void modify() {
		
	}
}
