package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.item.service.ItemDetailServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	
	
    private final ItemDetailService itemDetailService;
   
    @GetMapping("/detail")
    public String detail(@RequestParam int itemIdx, Model model) {
        ItemPhoto item = itemDetailService.getItem(itemIdx);
        model.addAttribute("item", item);
        log.info("전달된 itemIdx = {}", itemIdx);
        return "item"; // 뷰 이름
    }
    
//    @GetMapping("/{itemIdx}")
//    public String itemIdx(@PathVariable Integer itemIdx, Model model) {
    	
    	// itemidx 를 매개변수로 받는 서비스를 호출
    	// select ~~~ from item where itemIdx = #{itemIdx}
    	
    	//model.addAttribute("item", item);
    	
    	
    	
    	// "item"
    }

