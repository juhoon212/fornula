package com.fornula.domain.item.service;

import java.util.Map;

public interface ItemBoardService {
	Map<String, Object> getItemList(int pageNum);
//	void modifyItem(Item item);
    int getItemBoardCount();
	Map<String, Object> searchList(int pageNum,String searchKeyword);
	Map<String, Object> searchCategoryList(int pageNum);
}