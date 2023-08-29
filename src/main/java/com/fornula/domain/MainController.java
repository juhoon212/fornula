package com.fornula.domain;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 홈으로만 가는 컨트롤러 다른 것 작성 x
 */
@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String home() {
	
		return "main";
	}
}
	