package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.mapper.java.MypageInfoMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageInfoRepositoryImpl implements MypageInfoRepository{
	
	private final SqlSession sqlSession;


	@Override
	public int updateMypageInfo(int One, int Two, int Three, String id) {
		
		return sqlSession.getMapper(MypageInfoMapper.class).updateMypageInfo(One, Two, Three, id);
	}


	@Override
	public Member selectMypagePassword(String id) {
		
		return sqlSession.getMapper(MypageInfoMapper.class).selectMypagePassword(id);
	}
  
}
