package com.fornula.domain.member.service;

import com.fornula.domain.member.dto.Member;

public interface MemberLoginService {
	 Member login(String id, String password);
	
	 Member findByEmail(String email); // 아이디 찾기
	 
	 Member findPw(String id, String email); // 비밀번호 찾기
	 
	 Member findByIdx(int idx);
	 
	 Member findMemberPw(String id, String newPassword);
	 
	 int updatePassword(String id, String password);
	
	
	
}