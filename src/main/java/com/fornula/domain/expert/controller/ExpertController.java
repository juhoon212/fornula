package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")

public class ExpertController {
	//전문가 마이페이지(판매관리)
	@RequestMapping(value = "/expertmypage")
	public String mypage() {
		log.info("ExpertController 클래스의 mypage() 메소드 실행");
		return "expert-mypage";
	}	
	
	//전문가 정보수정 페이지 
	@RequestMapping(value = "/expertinput")
	public String input() {
		log.info("ExpertController 클래스의 input() 메소드 실행");
		return "expert-input";
	}
	
	//전문가 상품등록전 보여줄 경고문 
	@RequestMapping(value = "/expertitem")
	public String item() {
		log.info("ExpertController 클래스의 item() 메소드 실행");
		return "expert-item";
	}
	
	//전문가 포폴 출력페이지 
	@RequestMapping(value = "/expertoutput")
	public String output() {
		log.info("ExpertController 클래스의 output() 메소드 실행");
		return "expert-output";
	}
	
	//마이페이지(구매관리)
	@RequestMapping(value = "/membermypage")
	public String memberMypage() {
		log.info("ExpertController 클래스의 memberMypage() 메소드 실행");
		return "expert-mypage";
	}
}