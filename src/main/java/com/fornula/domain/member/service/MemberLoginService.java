package com.fornula.domain.member.service;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginService {
	 Member login(String id, String password);
	
	 Member findByEmail(String email);
	 
	 Member findPw(String password);
	
	
}
