package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;

public interface ExpertJoinDAO {
	int insertExpertInfo(Expert expert);
	void updateExpertStatus(Auth auth);

}
