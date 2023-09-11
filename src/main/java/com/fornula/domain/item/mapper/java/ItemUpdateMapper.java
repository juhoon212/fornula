package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;

public interface ItemUpdateMapper {
	
	int updateItem(Item item);
	Item findItemByIdx(int itemIdx);
}
