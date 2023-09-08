package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

public interface ExpertJoinDAO {
	int insertExpertInfo(Expert expert);
	void updateExpertStatus(Member member);
	Member exceptionExpert(int memberIdx);

}
