package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemForm;

public interface ItemInsertMapper {
	int insertItem(ItemForm itemForm);
	Item selectItemIdx(int expertIdx);
	int insertPhoto(Photo photo);
	int updateItemPhoto(int itemIdx);
	Item exceptionItem(String itemName);
}
