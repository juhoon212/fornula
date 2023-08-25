package com.fornula.domain.item.service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemInsertService {
	int addItem(Item item);
	Item getItemIdx(int expertIdx);
	void modifyItemPhoto(int itemIdx,int newPhotoIdx);
	int addPhoto(Photo photo);
}
