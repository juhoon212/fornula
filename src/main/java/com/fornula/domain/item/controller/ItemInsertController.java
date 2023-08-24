package com.fornula.domain.item.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.service.ItemInsertService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ItemInsertController {
	private final ItemInsertService itemInsertService;

	@RequestMapping(value="/iteminsert", method=RequestMethod.GET)
	public String insert() {
		log.info("ItemInsertController 클래스의 insert 메소드 GET 실행");
		return "item-insert";
	}
	
	@RequestMapping(value="/iteminsert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Item item,Model model) {
		try {
			itemInsertService.addItem(item);
		} catch (Exception e) {
			log.info("ItemInsertController 클래스의 insert 메소드 POST 방식 실행");
			return "item-board";
		}
		return "redirect:/expert-mypage";
	}
}
