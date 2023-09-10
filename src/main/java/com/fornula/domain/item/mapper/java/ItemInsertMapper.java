package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemInsertMapper {
	int insertItem(Item item);
	Item selectItemIdx(int expertIdx);
	int insertPhoto(Photo photo);
	int updateItemPhoto(int itemIdx);
	Item exceptionItem(String itemName);
}
