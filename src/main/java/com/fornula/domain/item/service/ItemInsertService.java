package com.fornula.domain.item.service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemInsertService {
	int addItem(Item item);
	Item getItemIdx(int expertIdx);
	int addPhoto(Photo photo);
	int modifyItemPhoto(int itemIdx);
}
