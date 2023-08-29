package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertInputMapper;
import com.fornula.domain.item.dto.Category;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertInputDAOImpl implements ExpertInputDAO {
	private final SqlSession sqlSession;
	
	@Override
	public void updateExpert(Expert expert) {
        sqlSession.getMapper(ExpertInputMapper.class).updateExpert(expert);
	}
	
	@Override
	public Category selectOriginalCategory(int expertIdx) {
		return sqlSession.getMapper(ExpertInputMapper.class).selectOriginalCategory(expertIdx);
	}
}