package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.mapper.java.ItemPaymentMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemPaymentRepositoryImpl implements ItemPaymentRepository{

	private final SqlSession sqlSession;
	
	
	@Override
	public Item selectItemPayment(int itemIdx) {

		return sqlSession.getMapper(ItemPaymentMapper.class).selectItemPayment(itemIdx);
	}

}
