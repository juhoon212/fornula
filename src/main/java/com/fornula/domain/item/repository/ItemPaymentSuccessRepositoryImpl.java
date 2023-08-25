package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.mapper.java.ItemPaymentSuccessMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemPaymentSuccessRepositoryImpl implements ItemPaymentSuccessRepository{

	private final SqlSession sqlSession;
	
	@Override
	public int insertPurchaseItem(int itemIdx, int memberIdx) {
		
		return sqlSession.getMapper(ItemPaymentSuccessMapper.class).insertPurchaseItem(itemIdx, memberIdx);
	}

	@Override
	public int insertSalesItem(int itemIdx) {

		return sqlSession.getMapper(ItemPaymentSuccessMapper.class).insertSalesItem(itemIdx);
	}
	
}
