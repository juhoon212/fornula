package com.fornula.domain.expert.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fornula.domain.exception.custom.ExistsExpertException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.expert.repository.ExpertJoinDAO;
import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@RequiredArgsConstructor
public class ExpertJoinServiceImpl implements ExpertJoinService {
	private final ExpertJoinDAO expertJoinDAO;
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addExpertInfo(Expert expert) throws ExistsExpertException{
		Member member=expertJoinDAO.exceptionExpert(expert.getMemberIdx());
		log.info("member : {}", member);
		
		if(member.getMemberStatus()==2) {
			log.info("등록 실패");
			throw new ExistsExpertException("이미 전문가로 등록되었습니다.");
			
		}
		
		expertJoinDAO.insertExpertInfo(expert);
		log.info("expert : {}", expert);
		log.info("등록 완료");
	}

	@Override
	public void updateExpertStatus(Member member) {
		expertJoinDAO.updateExpertStatus(member);
		
	}
}
