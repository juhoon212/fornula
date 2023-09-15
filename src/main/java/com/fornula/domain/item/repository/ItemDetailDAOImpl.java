package com.fornula.domain.item.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.mapper.java.ReviewMapper;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.mapper.java.ItemDetailMapper;
import com.fornula.domain.item.mapper.java.ItemUpdateMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemDetailDAOImpl implements ItemDetailDAO {
	private final SqlSession sqlSession;
	
	@Override
	public Expert findByMemberIdx(int memberIdx) {
		return sqlSession.getMapper(ItemDetailMapper.class).findByMemberIdx(memberIdx);
	}
	@Override
	public Item selectItem(int itemIdx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectItem(itemIdx);
	}
	
	public Photo selectPhoto(int memberIdx) {
		return sqlSession.getMapper(ItemDetailMapper.class).selectPhoto(memberIdx);
	}
	@Override
	public int updateItem(Item item) {
	
		return sqlSession.getMapper(ItemUpdateMapper.class).updateItem(item);
	}
	@Override
	public Item findItemByIdx(int itemIdx) {
		return sqlSession.getMapper(ItemUpdateMapper.class).findItemByIdx(itemIdx);
	}
	@Override
	public int updatePhoto(Photo photo) {
		return sqlSession.getMapper(ItemUpdateMapper.class).updatePhoto(photo);
	}
	@Override
	public Photo findByItemIdx(int itemIdx) {
		return sqlSession.getMapper(ItemUpdateMapper.class).findPhotoByItemIdx(itemIdx);
	}
	
	
	
}
