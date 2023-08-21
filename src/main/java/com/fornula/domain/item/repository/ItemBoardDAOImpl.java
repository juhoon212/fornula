package com.fornula.domain.item.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.mapper.java.ItemBoardMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemBoardDAOImpl implements ItemBoardDAO{
	private final SqlSession sqlSession;
	
//	마찬가지로 여기도 수정해야 할듯
	@Override
	public List<Item> selectItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).selectItemList(map);
	}
	
//	마찬가지로 여기도 수정해야 할듯
	@Override
	public List<Item> selectCategoryItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).selectCategoryItemList(map);
	}
	
//	마찬가지로 여기도 수정해야 할듯
	@Override
	public List<Item> searchItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).searchItemList(map);
	}
}
