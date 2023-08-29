package com.fornula.domain.item.service;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;

public interface ItemBoardService {
	Map<String, Object> getItemList(int pageNum);
	Map<String, Object> getCategoryItemList(int pageNum);
    Map<String, Object> getSearchItemList(int pageNum, String searchKeyword);
//	void modifyItem(Item item);
    int getItemBoardCount();
    
    //메인페이지 상품 출력
    List<ItemPhotoCategoryCart> getMainItemList();
}