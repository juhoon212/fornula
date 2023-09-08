package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

public interface ExpertJoinMapper {
	int insertExpertInfo(Expert expert);
	void updateExpertStatus(Member member);
	Member exceptionExpert(int memberIdx);
}
