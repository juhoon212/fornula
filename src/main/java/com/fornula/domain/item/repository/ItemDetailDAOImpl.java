package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.mapper.java.ItemDetailMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemDetailDAOImpl implements ItemDetailDAO {
	private final SqlSession sqlSession;
	
	@Override
	public Item selectItem(int item_idx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItem(item_idx);
	}
	
	@Override
	public Item selectItemExpert(int expert_idx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItemExpert(expert_idx);
	}
}
