package com.fornula.domain.item.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;

public interface SearchDAO {
	List<ItemPhotoCategoryCart> searchItemList(Map<String, Object> map); 
	List<ItemPhotoCategoryCart> searchItemCategoryList(Map<String, Object> map); 
    int selectItemBoardCount();
}
