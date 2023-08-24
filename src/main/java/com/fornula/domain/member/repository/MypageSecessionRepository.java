package com.fornula.domain.member.repository;

import com.fornula.domain.member.dto.Member;

public interface MypageSecessionRepository {
	int updateMypageSecession(String id);
	Member selectMypageSecession(String id);
	
}
