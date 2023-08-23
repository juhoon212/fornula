package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.expert.mapper.java.ExpertInputMapper;
import com.fornula.domain.item.dto.Item;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertInputDAOImpl implements ExpertInputDAO {
	private final SqlSession sqlSession;
	
	@Override
	public int updateExpert(Expert expert) {
		return sqlSession.getMapper(ExpertInputMapper.class).updateExpert(expert);
	}
	
	@Override
	public List<Item> selectExpertItemList(Map<String, Object> map) {
		return sqlSession.getMapper(ExpertInputMapper.class).selectExpertItemList(map);
	}
	
	@Override
	public int insertExpertInfo(Expert expert) {
		return sqlSession.getMapper(ExpertInputMapper.class).insertExpertInfo(expert);
	}
	
	@Override
	public int selectExpertBoardCount() {
		return sqlSession.getMapper(ExpertInputMapper.class).selectExpertBoardCount();
	}
}
