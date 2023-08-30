package com.fornula.domain.item.controller;

import java.util.Map;

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
   
   @GetMapping("/{itemIdx}/{pageNum}")
   public String itemIdx(@PathVariable Integer itemIdx, 
		   				@PathVariable Integer pageNum,
		   				Model model
		   				) {
	   
	   	if(pageNum == null) {
	   		pageNum = 1;
	   	}

    	Item findItem = itemDetailService.getItem(itemIdx);
    	Photo selectPhoto = itemDetailService.selectPhoto(itemIdx);
    	
    	int pos = selectPhoto.getItemfileName().lastIndexOf("_");
    	String originalFileName = selectPhoto.getItemfileName().substring(pos + 1); // 사진 로직
    	
    	
//    	Map<String, Object> map = itemDetailService.getReviewList(pageNum); // 후기 로직
		
//		model.addAttribute("pager", map.get("pager"));
//		model.addAttribute("fileBoardList", map.get("fileBoardList"));
    	
    	
    	
    	model.addAttribute("item", findItem);
    	model.addAttribute("originalFileName", originalFileName);
    	
    	
    	
    	return "item";
    }
}