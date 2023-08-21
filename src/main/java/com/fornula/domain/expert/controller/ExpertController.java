package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpertController {
	@RequestMapping("/payment")
	public String payment() {
		return "payment";
	}
}
