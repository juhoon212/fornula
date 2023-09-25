package com.fornula.domain.member.service;

import java.util.List;

import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;

public interface MemberSecurityService {
	
	int addSecurityMember(Member member);
	int addAuth(Auth auth);
	List<Member> findSecurityMemberById(String id);
	Member getSecurityMember(String id);}
