package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
// 우리 어차피 AJAX 사용할거라 여기선 확인하는 용도로만 작성함 추후에 여기 싹 변경할 것
public class ExpertController {
	//전문가 등록
	@RequestMapping(value = "/expertjoin")
	public String join() {
		log.info("ExpertController 클래스의 join() 메소드 실행");
		return "expert-join";
	}
	
	//전문가 정보수정
	@RequestMapping(value = "/expertinput")
	public String input() {
		log.info("ExpertController 클래스의 input() 메소드 실행");
		return "expert-input";
	}
	
	//전문가 상품등록
	@RequestMapping(value = "/expertitem")
	public String item() {
		log.info("ExpertController 클래스의 item() 메소드 실행");
		return "expert-item";
	}
	
	//전문가 판매내역
	@RequestMapping(value = "/expertsales")
	public String sales() {
		log.info("ExpertController 클래스의 sales() 메소드 실행");
		return "expert-sales";
	}
	
	//전문가 포트폴리오
	@RequestMapping(value = "/expertoutput")
	public String output() {
		log.info("ExpertController 클래스의 output() 메소드 실행");
		return "expert-output";
	}	
}