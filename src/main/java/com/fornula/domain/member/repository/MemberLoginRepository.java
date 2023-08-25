package com.fornula.domain.member.repository;

import java.util.Optional;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.mapper.java.MemberLoginMapper;

public interface MemberLoginRepository {
	
	// 로그인
	Optional<Member> selectMemberInfo(String id);
	
	// Email 로 id 찾기
	Optional<Member> selectMemberId(String email);
	
	// id , email로 패스웓드 찾기
	Optional<Member> selectMemberPw(String id, String email);
	
	Optional<Member> findByIdx(int memberIdx);
	
	int updateMemberPassword(String password, String id);
}
