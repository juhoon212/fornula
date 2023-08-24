package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
// 우리 어차피 AJAX 사용할거라 여기선 확인하는 용도로만 작성함 추후에 여기 싹 변경할 것 -> 함
public class ExpertController {
	//전문가 포트폴리오
	@RequestMapping(value = "/expertmypage")
	public String mypage() {
		log.info("ExpertController 클래스의 mypage() 메소드 실행");
		return "expert-mypage";
	}	
	
	//테스트용
	@RequestMapping(value = "/expertinput")
	public String test1() {
		log.info("ExpertController 클래스의 test1() 메소드 실행");
		return "expert-input";
	}	
}