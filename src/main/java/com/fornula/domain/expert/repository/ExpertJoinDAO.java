package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;

public interface ExpertJoinDAO {
	//전문가 중복 등록 예외처리
	Auth exceptionExpert(String id);
	//전문가 등록
	int insertExpertInfo(Expert expert);
	//회원에서 전문가로 상태 변경
	void updateExpertStatus(Auth auth);

	void updateStatus(int memberIdx);

}
