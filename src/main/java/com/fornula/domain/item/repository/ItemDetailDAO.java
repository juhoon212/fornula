package com.fornula.domain.item.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailDAO {
	ItemPhoto selectItem(int itemIdx);
	ExpertMember selectItemExpert(int expertIdx);
	Expert findByMemberIdx(int memberIdx);
}
