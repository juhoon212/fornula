package com.fornula.domain.item.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;

public interface CartRepository {
	int insertCart(Cart cart);
	int deleteCart(@Param("itemIdx") int itemIdx, @Param("memberIdx") int memberIdx);
	Photo selectCartPhotoidx(int itemIdx);
	Cart selectCartInfo(@Param("memberIdx") int memberIdx, @Param("itemIdx") int itemIdx);
	
	List<CartList> selectCart(int memberIdx);

}
