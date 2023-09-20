package com.fornula.domain.item.mapper.java;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;

public interface CartMapper {
	int inserCart(Cart cart);
	Photo selectCartPhotoidx(int itemIdx);
	int deleteCart(@Param("itemIdx") int itemIdx, @Param("memberIdx") int memberIdx);
	Cart selectCartInfo(@Param("memberIdx") int memberIdx, @Param("itemIdx") int itemIdx);
	
	//장바구니 내역 출력
	List<CartList> selectCart(int memberIdx);
}

