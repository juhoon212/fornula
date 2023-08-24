package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;


public interface MemberJoinService {
	
	Member idCheck(String id);
}
