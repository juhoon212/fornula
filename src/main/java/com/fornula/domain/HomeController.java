package com.fornula.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		log.info("Homecontroller = {}", HomeController.class);
		return "my-page";
	}
}
