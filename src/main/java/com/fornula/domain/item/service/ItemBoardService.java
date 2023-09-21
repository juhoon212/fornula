package com.fornula.domain.item.service;

import java.util.Map;

public interface ItemBoardService {
	Map<String, Object> getItemList(int pageNum, Integer categoryIdx, String searchKeyword);
//	void modifyItem(Item item);
    int getItemBoardCount();
}