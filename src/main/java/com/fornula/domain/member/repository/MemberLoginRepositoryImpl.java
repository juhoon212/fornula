package com.fornula.domain.member.repository;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttribute;

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
	@Override
	public Optional<Member> selectMemberId(String email) {
		return sqlSession.getMapper(MemberLoginMapper.class).selectMemberId(email);
	}
	
	@Override
	public Optional<Member> selectMemberPw(String id, String email) {
		return sqlSession.getMapper(MemberLoginMapper.class).selectMemberPw(id, email);
	}
	
	@Override
	public Optional<Member> findByIdx(int memberIdx) {
		return sqlSession.getMapper(MemberLoginMapper.class).findByIdx(memberIdx);
	}

	@Override
	public int updateMemberPassword(String password, String id) {
		return sqlSession.getMapper(MemberLoginMapper.class).updateMemberPassword(password, id);
	}

	
	
	
	
	
	
}
