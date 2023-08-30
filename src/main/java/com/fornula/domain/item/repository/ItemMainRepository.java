package com.fornula.domain.item.repository;

import java.util.List;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;

public interface ItemMainRepository {
	 //메인페이지 상품 출력
    List<ItemPhotoCategoryCart> mainItemList();
}
