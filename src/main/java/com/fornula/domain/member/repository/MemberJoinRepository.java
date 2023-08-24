package com.fornula.domain.member.repository;

import java.util.Optional;

import com.fornula.domain.member.dto.Member;

public interface MemberJoinRepository {
	
	Optional<Member> idCheck(String id);
}
