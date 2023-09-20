package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;

public interface ExpertJoinMapper {
	int insertExpertInfo(Expert expert);
	void updateExpertStatus(CustomMemberDetails member);
	
}
