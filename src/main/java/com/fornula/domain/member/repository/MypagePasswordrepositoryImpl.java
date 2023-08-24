package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.MypagePasswordMapper;
import com.fornula.domain.member.service.MypagePasswordService;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class MypagePasswordrepositoryImpl implements MypagePasswordRepository{

	private final SqlSession sqlSession;

	@Override
	public int updateMypagePassword(String id, String password) {
		
		return sqlSession.getMapper(MypagePasswordMapper.class).updateMypagePassword(id, password);
	}

	@Override
	public Member selectMypagePassword(String id) {
		
		return sqlSession.getMapper(MypagePasswordMapper.class).selectMypagePassword(id);
	}

}
