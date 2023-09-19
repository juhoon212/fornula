package com.fornula.domain.item.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.repository.ItemBoardDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemBoardServiceImpl implements ItemBoardService{
	private final ItemBoardDAO itemBoardDAO;
//	상품 리스트(6개씩 출력되게 할거야) 출력 용도
	@Override
	public Map<String, Object> getItemList(int pageNum, Integer categoryIdx, String searchKeyword) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 6, 6);
		
		Map<String, Object> pageMap=new HashMap<>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		
		// categoryIdx를 파라미터로 전달
	    pageMap.put("categoryIdx", categoryIdx);
		log.info("categoryIdx={}",categoryIdx);
		// searchKeyword를 파라미터로 전달
		pageMap.put("searchKeyword", searchKeyword);
		log.info("categoryIdx={}",categoryIdx);
		
		List<ItemPhotoCategoryCart> itemBoardList=itemBoardDAO.selectItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<>();
		resultMap.put("itemBoardList", itemBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
    
//  상품 갯수를 검색하는 용도(상품 게시글의 갯수를 샌 다음 1,2,...,4 같은 페이지 처리에 사용할 것
    @Override
    public int getItemBoardCount() {
        return itemBoardDAO.selectItemBoardCount();
    }
}