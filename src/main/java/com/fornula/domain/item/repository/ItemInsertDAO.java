package com.fornula.domain.item.repository;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemInsertDAO {
	int insertItem(Item item);
	Item selectItemIdx(int expertIdx);
	int updateItemPhoto(@Param("itemIdx") int itemIdx,@Param("newPhotoIdx") int newPhotoIdx);
	int insertPhoto(Photo photo);
}
