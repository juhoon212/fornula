package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailMapper {
	ItemPhoto selectItem(int itemIdx);
//	Expert findByMemberIdx(int memberIdx);
}
