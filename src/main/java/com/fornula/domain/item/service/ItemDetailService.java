package com.fornula.domain.item.service;

import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailService {
	void getItem(ItemPhoto itemPhoto);
	void getItemExpert(ExpertMember expertMember);
}
