package com.fornula.domain.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Interest;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.MemberDTO;
import com.fornula.domain.member.mapper.java.MemberJoinMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberJoinRepositoryImpl implements MemberJoinRepository {

	private final SqlSession sqlSession;
		
	@Override
	public void join(MemberDTO memberDTO) {
		 sqlSession.getMapper(MemberJoinMapper.class).joinMember(memberDTO);
	}
	
}
