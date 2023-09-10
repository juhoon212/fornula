package com.fornula.domain.item.repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemForm;

public interface ItemInsertDAO {
	int insertItem(ItemForm itemForm);
	Item selectItemIdx(int expertIdx);
	int insertPhoto(Photo photo);
	int updateItemPhoto(int itemIdx);
	Item exceptionItem(String itemName);
}
