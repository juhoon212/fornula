package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.mapper.java.ExpertBoardMapper;
import com.fornula.domain.item.dto.itemdetail.ItemPhotoForExpert;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertBoardDAOImpl implements ExpertBoardDAO{
	private final SqlSession sqlSession;
	
	@Override
	public List<ItemPhotoForExpert> selectBoardList(Map<String, Object> map) {
		return sqlSession.getMapper(ExpertBoardMapper.class).selectBoardList(map);
	}
	
	@Override
	public int selectItemCount() {
		return sqlSession.getMapper(ExpertBoardMapper.class).selectItemCount();
	}
}
