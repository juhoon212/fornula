package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class ExpertController {
	@RequestMapping(value = "/expertmypage")
	public String mypage() {
		log.info("ExpertController �겢�옒�뒪�쓽 mypage() 硫붿냼�뱶 �떎�뻾");
		return "expert-mypage";
	}	
}