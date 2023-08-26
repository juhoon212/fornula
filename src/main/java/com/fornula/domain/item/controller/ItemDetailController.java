package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	private final ItemDetailService itemDetailService;
	/* 작업중
	@GetMapping("/detail")
	public String detail(@RequestParam int itemIdx,Model model){
		model.addAttribute("", itemDetailService.getItem(itemIdx));
		return "item";
	}
	*/
}
