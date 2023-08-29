package com.fornula.domain.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.item.service.ItemDetailServiceImpl;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	
	
    private final ItemDetailService itemDetailService;
   
   @GetMapping("/{itemIdx}")
   public String itemIdx(@PathVariable Integer itemIdx, Model model) {
    	
    	Item findItem = itemDetailService.getItem(itemIdx);
    	Photo selectPhoto = itemDetailService.selectPhoto(itemIdx);
    	
    	int pos = selectPhoto.getItemfileName().lastIndexOf("_");
    	String originalFileName = selectPhoto.getItemfileName().substring(pos + 1); // 사진 로직
    	
    	
    	
    	
    	
    	model.addAttribute("item", findItem);
    	model.addAttribute("originalFileName", originalFileName);
    	
    	
    	
    	return "item";
    }
}

