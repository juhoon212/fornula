package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/item/update")
public class ItemUpdateController {
	
	private final ItemDetailService itemDetailService;
	
	@GetMapping("/{itemIdx}")
	public String showUpdateItemForm(@PathVariable int itemIdx, Model model) {
		
		Item findItem = itemDetailService.findItemByIdx(itemIdx);
		
		model.addAttribute("item", findItem);
		
		return "item-update";
	}
	
	
	
	

}
