package com.fornula.domain.item.mapper.java;

import com.fornula.domain.item.dto.Item;

public interface ItemDetailMapper {
	Item selectItem(int item_idx);
	Item selectItemExpert(int expert_idx);
}
