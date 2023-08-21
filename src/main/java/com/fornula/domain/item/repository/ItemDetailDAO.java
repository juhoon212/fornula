package com.fornula.domain.item.repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemDetailDAO {
	Item selectItem(ItemPhoto itemPhoto);
	Item selectItemExpert(ExpertMember expertMember);
}
