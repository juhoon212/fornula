package com.fornula.domain.member.repository;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.MemberLoginMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Repository
@Slf4j
@RequiredArgsConstructor
public class MemberLoginRepositoryImpl implements MemberLoginRepository{
	
	private final SqlSession sqlSession;

	@Override
	public Optional<Member> selectMemberInfo(String id, String password) {
		return sqlSession.getMapper(MemberLoginMapper.class).selectMemberInfo(id, password);
	}
	
	public Optional<Member> selectMemberId(String email) {
		return sqlSession.getMapper(MemberLoginMapper.class).selectMemberId(email);
	}
	
	public Optional<Member> selectMemberPw(String id, String email) {
		return sqlSession.getMapper(MemberLoginMapper.class).selectMemberPw(id, email);
	}
	
	
	
}
