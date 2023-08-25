package com.fornula.domain.member.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.MemberJoinMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberJoinRepositoryImpl implements MemberJoinRepository{
	
	private final SqlSession sqlSession;

	@Override
	public Optional<Member> idCheck(String id) {
		
		return sqlSession.getMapper(MemberJoinMapper.class).idCheck(id);
	}

	@Override
	public int joinMember(Member member) {
		return sqlSession.getMapper(MemberJoinMapper.class).joinMember(member);
	}

	@Override
	public Category selectCategory(String small) {
		
		return sqlSession.getMapper(MemberJoinMapper.class).selectCategory(small);
	}

}
