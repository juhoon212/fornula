package com.fornula.domain.expert.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fornula.domain.exception.custom.ExistsExpertException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.expert.repository.ExpertJoinDAO;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ExpertJoinServiceImpl implements ExpertJoinService {
	private final ExpertJoinDAO expertJoinDAO;
	private final HttpSession session;
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addExpertInfo(Expert expert) throws ExistsExpertException{
		CustomMemberDetails member = (CustomMemberDetails ) session.getAttribute(SessionConst.Login_Member);
		
		Auth auth = expertJoinDAO.exceptionExpert(member.getId());
		//role을 뽑는거니까
		log.info("auth : {}", auth);
		//role이 전문가이면
		if(auth!=null) {
			log.info("등록 실패");
			throw new ExistsExpertException("이미 전문가로 등록되었습니다.");
			
		}
		
		expertJoinDAO.insertExpertInfo(expert);
		log.info("expert : {}", expert);
		log.info("등록 완료");
	}

	@Override
	public void updateExpertStatus(Auth auth) {
		expertJoinDAO.updateExpertStatus(auth);
		
	}
}
