package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.mapper.java.ItemDetailMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemDetailDAOImpl implements ItemDetailDAO {
	private final SqlSession sqlSession;
	
	@Override
	public Item selectItem(ItemPhoto itemPhoto) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItem(itemPhoto);
	}
	
	@Override
	public Item selectItemExpert(ExpertMember expertMember) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItemExpert(expertMember);
	}
}
