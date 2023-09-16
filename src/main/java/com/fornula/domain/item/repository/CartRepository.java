package com.fornula.domain.item.repository;

import java.util.List;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;

public interface CartRepository {
	int insertCart(Cart cart);
	int delete(int itemIdx, int memberIdx);
	Photo selectCartPhotoidx(int itemIdx);
	List<CartList> selectCart(int memberIdx);
}
