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
		return "review_form";
	}
	
	//마이페이지 체크 용도 메소드 
	@GetMapping("/mypage")
	public String mypage() {
		log.info("Homecontroller = {}", HomeController.class);
		return "my-page2";
	}
	 
	//전문가페이지 체크 용도 메소드 
	@GetMapping("/expert")
	public String expert() {
		log.info("Homecontroller = {}", HomeController.class);
		return "expert-info";
	}
	
	//상품등록 체크 용도 메소드
	@GetMapping("/itemadd")
	public String itemadd() {
		log.info("Homecontroller = {}", HomeController.class);
		return "item-add";
	}
	
	//상품게시판 체크 용도 메소드
	@GetMapping("/itemboard")
	public String itemboard() {
		log.info("Homecontroller = {}", HomeController.class);
		return "item-board";
	}
	
	//상품상세페이지 체크 용도 메소드
	@GetMapping("/items")
	public String items() {
		log.info("Homecontroller = {}", HomeController.class);
		return "items";
	}
}
