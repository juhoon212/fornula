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
	public Member MypagePassword(String password) {
		Member mypageNewpassword=mypagePasswordRepository.selectMypagePassword(password);
		
		return mypageNewpassword;
	}

}
