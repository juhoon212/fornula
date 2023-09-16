package com.fornula.domain.item.mapper.java;

import java.util.List;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;

public interface CartMapper {
	int inserCart(Cart cart);
	Photo selectCartPhotoidx(int itemIdx);
	int delete(int itemIdx, int memberIdx);
	List<CartList> selectCart(int memberIdx);
}
