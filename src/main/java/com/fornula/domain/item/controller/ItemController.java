package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

// 페이지 이동용 컨트롤러
@Controller
@Slf4j
public class ItemController {
	//상품 등록
	@RequestMapping(value = "/itemadd")
	public String itemadd() {
		log.info("ItemController 클래스의 itemadd() 메소드 실행");
		return "item-add";
	}
	
	//상품 상세페이지
	@RequestMapping(value = "/item")
	public String item() {
		log.info("ItemController 클래스의 item() 메소드 실행");
		return "item";
	}	
	
	//상품 게시판
	@RequestMapping(value = "/itemboard")
	public String itemboard() {
		log.info("ItemController 클래스의 itemboard() 메소드 실행");
		return "item-board";
	}	
	//상품 게시판
	@RequestMapping(value = "/itemsales")
	public String itemsales() {
		log.info("ItemController 클래스의 itemsales() 메소드 실행");
		return "item-sales";
	}	
}