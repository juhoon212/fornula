package com.fornula.domain.member.mapper.java;

import java.util.List;

import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;

public interface SecurityMemberMapper {
	
	int addSecurityMember(Member member);
	int addAuth(Auth auth);
	List<Member> findSecurityMemberById(String id);
}
