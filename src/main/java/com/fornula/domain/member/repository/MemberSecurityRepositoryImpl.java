package com.fornula.domain.member.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.SecurityMemberMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberSecurityRepositoryImpl implements MemberSecurityRepository{
	
	private final SqlSession sqlSession;

	@Override
	public int addSecurityMember(Member member) {
		return sqlSession.getMapper(SecurityMemberMapper.class).addSecurityMember(member);
	}

	@Override
	public int addAuth(Auth auth) {
		return sqlSession.getMapper(SecurityMemberMapper.class).addAuth(auth);
	}

	@Override
	public List<Member> findSecurityMemberById(String id) {
		return sqlSession.getMapper(SecurityMemberMapper.class).findSecurityMemberById(id);
	}

}
