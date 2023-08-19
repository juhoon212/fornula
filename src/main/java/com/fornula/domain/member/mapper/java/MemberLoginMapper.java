package com.fornula.domain.member.mapper.java;

import java.util.Optional;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginMapper {
	
	Optional<Member> selectMemberInfo(@Param("id") String id , @Param("password") String password);
}
