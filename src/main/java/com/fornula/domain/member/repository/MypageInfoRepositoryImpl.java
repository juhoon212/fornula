package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.mapper.java.MypageInfoMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageInfoRepositoryImpl implements MypageInfoRepository{
	
	private final SqlSession sqlSession;
	
	
	@Override
	public int updateMypageInfo(String id) {
		
		return sqlSession.getMapper(MypageInfoMapper.class).updateMypageInfo(id);
	}
  
}
