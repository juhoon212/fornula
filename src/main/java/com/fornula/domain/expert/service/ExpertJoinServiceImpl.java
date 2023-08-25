package com.fornula.domain.expert.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.expert.repository.ExpertJoinDAO;
import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpertJoinServiceImpl implements ExpertJoinService {
	private final ExpertJoinDAO expertJoinDAO;
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addExpertInfo(Expert expert) {
		expertJoinDAO.insertExpertInfo(expert);
		
	}

	/*
	 * @Override public int searchExpertCategory(int interest) { return
	 * expertInputDAO.selectExpertCategory(interest);
	 * 
	 * }
	 * 
	 */
}
