package com.fornula.domain.admin.repository;

import java.util.List;

import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.member.dto.Member;

public interface AdminRepository {
	int findId(Member member); 
	int status(Member member);
	List<AdminMember> memberList();
}
