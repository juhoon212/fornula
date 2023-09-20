package com.fornula.domain.expert.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.expert.repository.ExpertJoinDAO;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ExpertJoinServiceImpl implements ExpertJoinService {
	private final ExpertJoinDAO expertJoinDAO;
	
	@Override
	public void addExpertInfo(Expert expert) {
		expertJoinDAO.insertExpertInfo(expert);
		
	}

	@Override
	public void updateExpertStatus(Auth auth) {
		expertJoinDAO.updateExpertStatus(auth);
		
	}
}
