package com.fornula.domain.member.repository;

import java.util.Optional;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginRepository {
	
	Optional<Member> selectMemberInfo(String id , String password);
}
