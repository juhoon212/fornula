package com.fornula.domain.member.repository;

import java.util.Optional;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;

public interface MemberJoinRepository {
	
	Optional<Member> idCheck(String id);
	
	int joinMember(Member member);
	
	Category selectCategory(String small);
}
