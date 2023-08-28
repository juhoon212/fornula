package com.fornula.domain.item.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.service.ItemBoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
@Slf4j
public class ItemBoardController {
    
	@Autowired
	private final ItemBoardService itemBoardService;
	
//  상품 전체를 출력하는 메소드  
    @GetMapping("/boardList")
    public String getItemBoardList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
        Map<String, Object> resultMap = itemBoardService.getItemList(pageNum);
        int filePos; // UUID로 된 파일이름 추출
        String originalFileName = null;
        
        List<ItemPhotoCategoryCart> resultList = (List<ItemPhotoCategoryCart>)resultMap.get("itemBoardList");
        for (ItemPhotoCategoryCart itemPhotoCategoryCart : resultList) {
			filePos = itemPhotoCategoryCart.getPhoto().getItemfileName().lastIndexOf("_");
			originalFileName = itemPhotoCategoryCart.getPhoto().getItemfileName().substring(filePos + 1);
		}
        
        log.info("pager = {}", resultMap.get("pager"));
        
        model.addAttribute("itemBoardList", resultMap.get("itemBoardList"));
        model.addAttribute("pager", resultMap.get("pager"));
        
        log.info("originalFileName = {}", originalFileName);
//        model.addAttribute("originalFileName", originalFileName);
   
        return "item-board";
    }

////  카테고리를 입력하여 검색하는 메소드
//    @GetMapping("/categoryItemList")
//    public String getCategoryItemList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
//        log.info("getCategoryItemList called with pageNum: {}", pageNum);
//
//        Map<String, Object> resultMap = itemBoardService.getCategoryItemList(pageNum);
//        model.addAttribute("itemCategoryBoardList", resultMap.get("itemCategoryBoardList"));
//        model.addAttribute("pager", resultMap.get("pager"));
//
//        return "itemBoard";
//    }
//    
////  검색어를 제공받아 해당 검색어가 item_name에 포함된 모든 상품을 출력하는 메소드
//    @GetMapping("/searchItemList")
//    public String getSearchItemList(@RequestParam(defaultValue = "1") int pageNum,
//                                    @RequestParam String searchKeyword, Model model) {
//        log.info("getSearchItemList called with pageNum: {} and searchKeyword: {}", pageNum, searchKeyword);
//
//        Map<String, Object> resultMap = itemBoardService.getSearchItemList(pageNum, searchKeyword);
//        model.addAttribute("searchItemCategoryBoardList", resultMap.get("searchItemCategoryBoardList"));
//        model.addAttribute("pager", resultMap.get("pager"));
//
//        return "itemBoard";
//    }
//    
////   페이징처리용 검색된 상품 게시글이 총 몇개인지 알아내는 메소드
//    @GetMapping("/itemBoardCount")
//    public String getItemBoardCount(Model model) {
//        log.info("getItemBoardCount called");
//
//        int itemBoardCount = itemBoardService.getItemBoardCount();
//        model.addAttribute("itemBoardCount", itemBoardCount);
//
//        return "itemBoard";
//    }
}