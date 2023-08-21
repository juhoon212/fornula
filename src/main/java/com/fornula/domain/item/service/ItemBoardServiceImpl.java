package com.fornula.domain.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.repository.ItemBoardDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemBoardServiceImpl implements ItemBoardService{
	private final ItemBoardDAO itemBoardDAO;
//	이게 맞나?
	@Override
	public Map<String, Object> getItemList(int pageNum) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 4, 4);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<ItemPhotoCategoryCart> itemBoardList=itemBoardDAO.selectItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("itemBoardList", itemBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
//	이게 맞나?
	@Override
	public Map<String, Object> getCategoryItemList(int pageNum) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 4, 4);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<ItemPhotoCategoryCart> itemCategoryBoardList=itemBoardDAO.selectCategoryItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("itemCategoryBoardList", itemCategoryBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
//	이게 맞나?
	@Override
	public Map<String, Object> getSearchItemList(int pageNum) {
		int totalBoard=itemBoardDAO.selectItemBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 4, 4);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<ItemPhotoCategoryCart> searchItemBoardList=itemBoardDAO.searchItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("searcgItemCategoryBoardList", searchItemBoardList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
}
