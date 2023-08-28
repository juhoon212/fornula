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

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	
	
    private final ItemDetailService itemDetailService;
   
    @GetMapping("/detail/{itemIdx}")
    public String detail(@PathVariable Integer itemIdx, Model model) {
        Item item = itemDetailService.getItem(itemIdx);
        model.addAttribute("item", item);
        log.info("전달된 itemIdx = {}", itemIdx);
        return "item"; // 뷰 이름
    }
    
   @GetMapping("/{itemIdx}")
   public String itemIdx(@PathVariable Integer itemIdx, Model model) {
    	
    	Item findItem = itemDetailService.getItem(itemIdx);
    	Photo selectPhoto = itemDetailService.selectPhoto(itemIdx);
    	int pos = selectPhoto.getItemfileName().lastIndexOf("_");
    	String originalFileName = selectPhoto.getItemfileName().substring(pos + 1);
    	
    	model.addAttribute("item", findItem);
    	model.addAttribute("originalFileName", originalFileName);
    	
    	return "item";
    }
}

