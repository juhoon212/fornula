package com.fornula.domain.item.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;


public interface CartService {
	void addCart(Cart cart);
	void removeCart(@Param("itemIdx") int itemIdx, @Param("memberIdx") int memberIdx);
	Photo getCartPhotoIdx(int itemIdx);
	Cart selectCartInfo(@Param("memberIdx") int memberIdx, @Param("itemIdx") int itemIdx);
	
	List<CartList> getCartList(int memberIdx);

}
