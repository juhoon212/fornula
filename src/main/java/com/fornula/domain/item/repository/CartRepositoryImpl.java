package com.fornula.domain.item.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.CartList;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.mapper.java.CartMapper;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CartRepositoryImpl implements CartRepository {
	private final SqlSession sqlSession;

	@Override
	public int insertCart(Cart cart) {
		return sqlSession.getMapper(CartMapper.class).inserCart(cart);
	}

	@Override
	public int deleteCart(int itemIdx, int memberIdx) {
		return sqlSession.getMapper(CartMapper.class).deleteCart(itemIdx, memberIdx);
	}

	@Override
	public Photo selectCartPhotoidx(int itemIdx) {
		return sqlSession.getMapper(CartMapper.class).selectCartPhotoidx(itemIdx);
	}

	@Override
	public Cart selectCartInfo(int memberIdx, int itemIdx) {
		return sqlSession.getMapper(CartMapper.class).selectCartInfo(memberIdx, itemIdx);
	}

	@Override
	public List<CartList> selectCart(int memberIdx) {
		return sqlSession.getMapper(CartMapper.class).selectCart(memberIdx);
	}

}
