package com.fornula.domain.member.service;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginService {
	public Member login(String id, String password);
}
