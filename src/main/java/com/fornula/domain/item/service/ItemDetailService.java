package com.fornula.domain.item.service;


import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailService {
	ItemPhoto getItem(int itemIdx);
	Expert findByMemberIdx(int memerIdx);
}
