package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemUpdateMapper {
	
	int updateItem(Item item);
	Item findItemByIdx(int itemIdx);
	int updatePhoto(Photo photo);
	Photo findPhotoByItemIdx(int itemIdx);
}
