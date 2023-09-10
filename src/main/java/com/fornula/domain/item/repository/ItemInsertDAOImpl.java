package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemForm;
import com.fornula.domain.item.mapper.java.ItemInsertMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemInsertDAOImpl implements ItemInsertDAO {
	private final SqlSession sqlSession;
	
	@Override
	public int insertItem(ItemForm itemForm) {
		return sqlSession.getMapper(ItemInsertMapper.class).insertItem(itemForm);
	}
	
	@Override
	public Item selectItemIdx(int expertIdx) {
		
		return sqlSession.getMapper(ItemInsertMapper.class).selectItemIdx(expertIdx);
	}
	
	@Override
	public int updateItemPhoto(int itemIdx) {
		return sqlSession.getMapper(ItemInsertMapper.class).updateItemPhoto(itemIdx);
	}
	
	@Override
	public int insertPhoto(Photo photo) {
		return sqlSession.getMapper(ItemInsertMapper.class).insertPhoto(photo);
	}
	
	@Override
	public Item exceptionItem(String itemName) {
		return sqlSession.getMapper(ItemInsertMapper.class).exceptionItem(itemName);
	}
}
