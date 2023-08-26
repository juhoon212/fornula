package com.fornula.domain.admin.service;

import java.util.List;

import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.member.dto.Member;

public interface AdminService {

	int findId(Member member); 
	int status(Member member);
	List<AdminMember> memberList();
}
