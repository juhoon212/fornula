package com.fornula.domain.item.service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemForm;

public interface ItemInsertService {
	int addItem(ItemForm itemForm);
	Item getItemIdx(int expertIdx);
	int addPhoto(Photo photo);
	int modifyItemPhoto(int itemIdx);
}
