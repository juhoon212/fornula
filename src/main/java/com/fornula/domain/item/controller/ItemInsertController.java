package com.fornula.domain.item.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

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
		return "item-insert";
	}
	
	@RequestMapping(value="/iteminsert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Item item,Model model) {
		try {
			itemInsertService.addItem(item);
		} catch (Exception e) {
			return "item-board";
		}
		return "redirect:/expert-mypage";
	}
}
