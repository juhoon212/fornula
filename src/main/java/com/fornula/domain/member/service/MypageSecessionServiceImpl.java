package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MypageSecessionRepository;
import com.fornula.domain.member.repository.MypageSecessionRepositoryimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MypageSecessionServiceImpl implements MypageSecessionService{
	
  private final MypageSecessionRepository mypageSessionRepository;
  
	@Override
	public Member mypageSecession(String id) throws MypageIdExcepion {
		Member mypageSession=mypageSessionRepository.selectMypageSecession(id);
		
		
		if(mypageSession==null || mypageSession.getId()==null || mypageSession.getId().equals("")) {
			throw new MypageIdExcepion("올바른 아이디를 입력해주세요.");
		}
		
	    
		mypageSessionRepository.updateMypageSecession(id);
		
		
		return mypageSession;
	} 

}
