 package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertJoinMapper;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertJoinDAOImpl implements ExpertJoinDAO{
	private final SqlSession sqlSession;

	@Override
	public int insertExpertInfo(Expert expert) {
		return sqlSession.getMapper(ExpertJoinMapper.class).insertExpertInfo(expert);
	}

	@Override
	public void updateExpertStatus(Auth auth) {
		sqlSession.getMapper(ExpertJoinMapper.class).updateExpertStatus(auth);
		
	}

	@Override
	public Auth exceptionExpert(String id) {
		return sqlSession.getMapper(ExpertJoinMapper.class).exceptionExpert(id);
		
	}

}
 