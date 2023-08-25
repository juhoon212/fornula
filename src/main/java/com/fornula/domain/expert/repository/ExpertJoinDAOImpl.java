package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertJoinMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertJoinDAOImpl implements ExpertJoinDAO{
	private final SqlSession sqlSession;

	@Override
	public int insertExpertInfo(Expert expert) {
		return sqlSession.getMapper(ExpertJoinMapper.class).insertExpertInfo(expert);
	}

}
