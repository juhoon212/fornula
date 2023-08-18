package com.fornula.domain.member.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MemberLoginRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberLoginServiceImpl implements MemberLoginService {
	
	
	private final MemberLoginRepository memberLoginRepository;

	@Override
	public Member login(String id, String password) {
		
		Member loginMember = memberLoginRepository.selectMemberInfo(id, password);
		
		boolean isCheckedPassword = BCrypt.checkpw(password, loginMember.getPassword());
		
		if(!isCheckedPassword) {
			throw new LoginFailException("비밀번호 인증오류");
		}
		
		
		return loginMember;
	}
	
	
}
