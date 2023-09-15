
package com.fornula.domain.item.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

		List<ItemPhotoCategoryCart> resultList = (List<ItemPhotoCategoryCart>) resultMap.get("itemBoardList");
		for (ItemPhotoCategoryCart itemPhotoCategoryCart : resultList) {
			filePos = itemPhotoCategoryCart.getPhoto().getItemfileName().lastIndexOf("_");

			String originalFileName = itemPhotoCategoryCart.getPhoto().getItemfileName().substring(filePos + 1);
			itemPhotoCategoryCart.getPhoto().setItemfileName(originalFileName);
		}
	}

//  헤더에 있는 검색창에 입력된 입력값이 포함된 상품만을 출력하는 메소드
	public String searchItemlist(@RequestParam(defaultValue = "1") int pageNum,
			@RequestParam(name = "searchKeywordk", required = false) String searchKeyword, Model model) {
		Map<String, Object> resultMap = itemBoardService.searchList(pageNum, searchKeyword);

		extractOriginalFileName(resultMap);
		log.info("pager = {}", resultMap.get("pager"));

		model.addAttribute(resultMap);
		log.info("resultMap: {}", resultMap);
		return "item-board";
	}

//  상품 게시판에서 카테고리 버튼을 클릭했을 떄 해당 카테고리만 출력되게 만드는 메소드   
}