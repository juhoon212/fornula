package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

public interface ExpertJoinService {
	void addExpertInfo(Expert expert);
	void updateExpertStatus(Member member);
	//int searchExpertCategory(int interest);
}
