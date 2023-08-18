package com.fornula.domain.member.repository;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginRepository {
	
	Member selectMemberInfo(String id , String password);
}
