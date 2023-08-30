package com.fornula.domain.item.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.mapper.java.ItemBoardMapper;
import com.fornula.domain.item.mapper.java.ItemMainMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemMainRepositoryImpl implements ItemMainRepository{
	private final SqlSession sqlSession;

	
	//메인페이지 상품 출력
		@Override
		public List<ItemPhotoCategoryCart> mainItemList() {
			return sqlSession.getMapper(ItemMainMapper.class).mainItemList();
		}
}
