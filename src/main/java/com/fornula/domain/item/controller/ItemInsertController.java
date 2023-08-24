package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemInsertController {
	
//	아이템 테이블에 값을 등록하는 용도
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@RequestParam String insert) {
		log.info("ItemInsertController 클래스의 insert() 메소드 실행");
		return insert;
	}
}
