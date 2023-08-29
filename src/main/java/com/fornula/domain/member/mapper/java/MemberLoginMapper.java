package com.fornula.domain.member.mapper.java;

import java.util.Optional;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginMapper {
	
	Optional<Member> selectMemberInfo(String id);
	
	Optional<Member> selectMemberId(String email);
	
	Optional<Member> selectMemberPw(@Param("id") String id , @Param("email") String email);
	
	Optional<Member> findByIdx(int memberIdx);
	
	int updateMemberPassword(@Param("password" )String password, @Param("id") String id);
}