package com.fornula.domain.item.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemDetailDAO {
	Item selectItem(int itemIdx);
	Expert findByMemberIdx(int memberIdx);
	Photo selectPhoto(int itemIdx);
	
}
