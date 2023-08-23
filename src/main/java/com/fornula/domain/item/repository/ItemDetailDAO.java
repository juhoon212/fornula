package com.fornula.domain.item.repository;

import com.fornula.domain.item.dto.Item;

public interface ItemDetailDAO {
	Item selectItem(int item_idx);
	Item selectItemExpert(int expert_idx);
}
