package com.fornula.domain.item.service;


import java.util.Map;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemDetailService {
	Item getItem(int itemIdx);
	Expert findByMemberIdx(int memerIdx);
	Photo selectPhoto(int itemIdx);
	int updateItem(Item item);
	Item findItemByIdx(int itemIdx);
}


