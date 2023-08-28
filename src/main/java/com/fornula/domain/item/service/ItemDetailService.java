package com.fornula.domain.item.service;


import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailService {
	ItemPhoto getItem(int itemIdx);
	ExpertMember getItemExpert(int expertIdx);
	Expert findByMemberIdx(int memerIdx);
}
