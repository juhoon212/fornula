package com.fornula.domain.member.mapper.java;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginMapper {
	
	Member selectMemberInfo(String id , String password);
}
