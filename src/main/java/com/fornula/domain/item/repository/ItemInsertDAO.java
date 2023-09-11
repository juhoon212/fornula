package com.fornula.domain.item.repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemInsertDAO {
	int insertItem(Item item);
	Item selectItemIdx(int expertIdx);
	int insertPhoto(Photo photo);
	int updateItemPhoto(int itemIdx);
	Item exceptionItem(String itemName);
}
