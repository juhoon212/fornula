package com.fornula.domain.item.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;


public interface CartService {
	void addCart(Cart cart);
	void removeCart(int itemIdx, int memberIdx );
	List<CartList> getCartList(int memberIdx);
	Photo getCartPhotoIdx(int itemIdx);
	List<Cart> selectCartInfo(@Param("memberIdx") int memberIdx, @Param("itemIdx") int itemIdx);

}
