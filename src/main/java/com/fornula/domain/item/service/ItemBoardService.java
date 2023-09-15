package com.fornula.domain.item.service;

import java.util.Map;

public interface ItemBoardService {
	Map<String, Object> getItemList(int pageNum, Integer categoryIdx);
//	void modifyItem(Item item);
    int getItemBoardCount();
	Map<String, Object> searchList(int pageNum,String searchKeyword);
}