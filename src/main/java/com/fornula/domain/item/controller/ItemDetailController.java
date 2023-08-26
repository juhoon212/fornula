package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ItemDetailController {
	private final ItemDetailService itemDetailService;
//	따로 예외 클래스 만들기
	@RequestMapping(value="/selectitem")
	public String detail(@RequestParam int itemIdx,Model model) throws Exception{
		model.addAttribute("", itemDetailService.getItem(itemIdx));
		return "item";
	}
}
