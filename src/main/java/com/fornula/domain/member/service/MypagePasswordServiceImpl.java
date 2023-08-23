package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MypagePasswordRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MypagePasswordServiceImpl implements MypagePasswordService {

	private final MypagePasswordRepository mypagePasswordRepository;

	@Override
	public Member mypagePasswordId(String id) {
		 Member mypageNewpasswordId = mypagePasswordRepository.selectMypagePassword(id);
			
		  
			return mypageNewpasswordId;
	}

	@Override
	public void modifyPassword(String id, String newPassword) {
		//이거 int로 저장안해도 되나...
		 mypagePasswordRepository.updateMypagePassword(id, newPassword);
		
	}




}
