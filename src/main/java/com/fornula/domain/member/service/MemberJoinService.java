package com.fornula.domain.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;


public interface MemberJoinService {
	
	Member idCheck(String id);
	
	int joinMember(Member member);
	
	List<Integer> selectCategory(List<String> categoryList);
	
}
