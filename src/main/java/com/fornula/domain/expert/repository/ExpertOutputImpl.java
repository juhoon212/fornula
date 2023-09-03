package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertInputMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ExpertOutputImpl implements ExpertOutputDAO{
	private final SqlSession sqlSession;
//	전문가 정보를 출력해줄 메소드
	@Override
	public Expert selectExpert(int expertIdx) {
		log.info("ExpertOutputImpl 클래스의 selectExpert()메소드");
		return sqlSession.getMapper(ExpertInputMapper.class).originalExpert(expertIdx);
	}
}