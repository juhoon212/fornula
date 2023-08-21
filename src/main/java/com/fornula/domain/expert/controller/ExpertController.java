package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ExpertController {
	//전문가 등록
	@RequestMapping(value = "/expertjoin")
	public String join() {
		log.info("ExportController 클래스의 join() 메소드 실행");
		return "expert_join";
	}
	
	//전문가 페이지 - 전문가 정보 수정/등록
	@RequestMapping(value = "/expertinput")
	public String input() {
		log.info("ExportController 클래스의 input() 메소드 실행");
		return "expert-input";
	}
	
	//전문가 페이지 - 전문가 구매내역
	@RequestMapping(value = "/expertsales")
	public String sales() {
		log.info("ExportController 클래스의 sales() 메소드 실행");
		return "expert-sales";
	}
	
	//전문가 페이지 - 전문가 포트폴리오
	@RequestMapping(value = "/expertoutput")
	public String output() {
		log.info("ExportController 클래스의 output() 메소드 실행");
		return "expert-output";
	}

	//전문가 페이지 - 전문가 상품등록
	@RequestMapping(value = "/expertitem")
	public String item() {
		log.info("ExportController 클래스의 item() 메소드 실행");
		return "expert-item";
	}
}