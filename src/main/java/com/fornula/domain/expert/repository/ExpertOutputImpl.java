package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertOutputMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertOutputImpl implements ExpertOutputDAO{
	private final SqlSession sqlSession;
	
	@Override
	public Expert selectExpert(int expert_idx) {
		return sqlSession.getMapper(ExpertOutputMapper.class).selectExpert(expert_idx);
	}
}
