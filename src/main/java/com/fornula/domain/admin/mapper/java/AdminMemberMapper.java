package com.fornula.domain.admin.mapper.java;

import java.util.List;

import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.member.dto.Member;

public interface AdminMemberMapper {
	
	int findId(Member member); 
	int status(Member member);
	List<AdminMember> memberList();
}