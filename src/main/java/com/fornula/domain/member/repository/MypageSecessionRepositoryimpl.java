package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.MypageSecessionMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MypageSecessionRepositoryimpl implements MypageSecessionRepository{
    public final SqlSession sqlSession;
	
	
	@Override
	public int updateMypageSecession(String id) {
		
		return sqlSession.getMapper(MypageSecessionMapper.class).updateMypageSecession(id);
	}


	@Override
	public Member selectMypageSecession(String id) {
		
		return sqlSession.getMapper(MypageSecessionMapper.class).selectMypageSecession(id);
	}
  
}
