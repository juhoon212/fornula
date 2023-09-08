
package com.fornula.domain.item.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.service.ItemBoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
@Slf4j
public class ItemBoardController {
    
	private final ItemBoardService itemBoardService;
	
//  상품 전체를 출력하는 메소드  
    @GetMapping("/boardList")
    public String getItemBoardList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
        Map<String, Object> resultMap = itemBoardService.getItemList(pageNum);
  
        
        extractOriginalFileName(resultMap);
        
        log.info("pager = {}", resultMap.get("pager"));
        
        model.addAttribute("itemBoardList", resultMap.get("itemBoardList"));
        model.addAttribute("pager", resultMap.get("pager"));
        
        return "item-board";
    }
    

    private void extractOriginalFileName(Map<String, Object> resultMap) {
    	
		int filePos;
		
		List<ItemPhotoCategoryCart> resultList = (List<ItemPhotoCategoryCart>)resultMap.get("itemBoardList");
		for (ItemPhotoCategoryCart itemPhotoCategoryCart : resultList) {
			filePos = itemPhotoCategoryCart.getPhoto().getItemfileName().lastIndexOf("_");
			
			String originalFileName = itemPhotoCategoryCart.getPhoto().getItemfileName().substring(filePos + 1);
			itemPhotoCategoryCart.getPhoto().setItemfileName(originalFileName);
		}
    }
}