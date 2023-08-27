package com.fornula.domain.item.service;

import java.util.Map;

import com.fornula.domain.item.dto.Item;

public interface ItemBoardService {
	Map<String, Object> getItemList(int pageNum);
	Map<String, Object> getCategoryItemList(int pageNum);
    Map<String, Object> getSearchItemList(int pageNum, String searchKeyword);
//	void modifyItem(Item item);
    int getItemBoardCount();
}
