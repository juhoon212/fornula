package com.fornula.domain.item.mapper.java;

import java.util.List;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;

public interface ItemMainMapper {
	 
    //메인페이지 상품 출력
    List<ItemPhotoCategoryCart> mainItemList();
}
