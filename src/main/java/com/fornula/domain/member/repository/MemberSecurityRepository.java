package com.fornula.domain.member.repository;

import java.util.List;

import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;

public interface MemberSecurityRepository {
	
	int addSecurityMember(Member member);
	int addAuth(Auth auth);
	List<Member> findSecurityMemberById(String id);
	Member findMemberById(String id);
}
