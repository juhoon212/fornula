package com.fornula.domain.item.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.mapper.java.ItemBoardMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemBoardDAOImpl implements ItemBoardDAO{
	private final SqlSession sqlSession;
	
	@Override
	public List<ItemPhotoCategoryCart> selectItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).selectItemList(map);
	}
	
	@Override
	public List<ItemPhotoCategoryCart> selectCategoryItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).selectCategoryItemList(map);
	}
	
	@Override
	public List<ItemPhotoCategoryCart> searchItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ItemBoardMapper.class).searchItemList(map);
	}
	
	@Override
	public int updateItem(Item item) {
		return sqlSession.getMapper(ItemBoardMapper.class).updateItem(item);
	}	
	@Override
	public int selectItemBoardCount() {
		return sqlSession.getMapper(ItemBoardMapper.class).selectItemBoardCount();
	}
}