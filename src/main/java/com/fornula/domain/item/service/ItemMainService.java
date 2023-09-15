package com.fornula.domain.item.service;

import java.util.List;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;

public interface ItemMainService {
	   
    //메인페이지 상품 출력
    List<ItemPhoto> getMainItemList();
}
