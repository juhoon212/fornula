package com.fornula.domain.item.mapper.java;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemDetailMapper {
	Item selectItem(int itemIdx);
	Expert findByMemberIdx(int memberIdx);
	Photo selectPhoto(int itemIdx);
}
