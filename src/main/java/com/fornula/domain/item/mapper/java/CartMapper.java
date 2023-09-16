package com.fornula.domain.item.mapper.java;

import java.util.List;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;

public interface CartMapper {
	int insertCart(Cart cart);
	int delete(int itemIdx, int memberIdx);
	List<CartList> selectCart(int memberIdx);
}
