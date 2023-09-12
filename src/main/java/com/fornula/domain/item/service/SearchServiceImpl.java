package com.fornula.domain.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.repository.SearchDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SearchServiceImpl implements SearchService{
	private final SearchDAO searchDAO;
	
	@Override
	public Map<String, Object> searchList(int pageNum) {
		int totalBoard=searchDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 6, 6);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		
		List<ItemPhotoCategoryCart> searchItemList=searchDAO.searchItemList(pageMap);

		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("searchItemList", searchItemList);
		
		return resultMap;
	}
	
	@Override
	public Map<String, Object> searchCategoryList(int pageNum) {
		int totalBoard=searchDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 6, 6);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		
		List<ItemPhotoCategoryCart> searchItemCategoryList=searchDAO.searchItemCategoryList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("searchItemCategoryList", searchItemCategoryList);
		
		return resultMap;
	}
	
	@Override
	public int getItemBoardCount() {
		return searchDAO.selectItemBoardCount();
	}
}
