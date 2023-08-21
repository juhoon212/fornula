package com.fornula.domain.item.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;

public interface ItemBoardMapper {  
	List<ItemPhotoCategoryCart> selectItemList(Map<String, Object> map);  
	List<ItemPhotoCategoryCart> selectCategoryItemList (Map<String, Object> map);
	List<ItemPhotoCategoryCart> searchItemList (Map<String, Object> map);
}
