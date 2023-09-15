package com.fornula.domain.item.repository;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

public interface ItemDetailDAO {
	Item selectItem(int itemIdx);
	Expert findByMemberIdx(int memberIdx);
	Photo selectPhoto(int itemIdx);
	int updateItem(Item item);
	Item findItemByIdx(int itemIdx);
	int updatePhoto(Photo photo);
	Photo findByItemIdx(int itemIdx);
}
