package com.fornula.domain.member.service;

import com.fornula.domain.member.dto.Member;

public interface MypagePasswordService {
	Member mypagePasswordId(String id);
	void modifyPassword(String id,String newPassword);
	
}
