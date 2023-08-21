package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailMapper {
	Item selectItem(ItemPhoto itemPhoto);
	Item selectItemExpert(ExpertMember expertMember);
}
