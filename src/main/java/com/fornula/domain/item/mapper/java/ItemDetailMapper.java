package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailMapper {
	ItemPhoto selectItem(int itemIdx);
	ExpertMember selectItemExpert(int expertIdx);
}
