package com.fornula.domain.item.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;

public interface CartRepository {
	int insertCart(Cart cart);
	int delete(int itemIdx, int memberIdx);
	Photo selectCartPhotoidx(int itemIdx);
	List<CartList> selectCart(int memberIdx);
	List<Cart> selectCartInfo(@Param("memberIdx") int memberIdx, @Param("itemIdx") int itemIdx);
}
