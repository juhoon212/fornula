package com.fornula.domain.member.service;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.exception.custom.NotFoundIdException;
import com.fornula.domain.exception.custom.NotFoundPwException;
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
		
		Member loginMember = memberLoginRepository.selectMemberInfo(id).orElseThrow(() -> new LoginFailException("아이디 또는 비밀번호가 맞지 않습니다."));
		
		log.info("loginMember = {}", loginMember.getId());
		
		boolean isCheckedPassword = BCrypt.checkpw(password, loginMember.getPassword());
		
		if(!isCheckedPassword) {
			throw new LoginFailException("아이디 또는 비밀번호가 맞지 않습니다.");
		}
		
		return loginMember;
	}

	@Override
	public Member findByEmail(String email) {
		
		Member findMember = memberLoginRepository.selectMemberId(email).orElseThrow(() -> new NotFoundIdException("검색하신 아이디가 없습니다."));
		
		
		log.info("findMember = {}", findMember);
		
		
		return findMember;
	}

	@Override
	public Member findPw(String id, String email) {
		
		Member findMember = memberLoginRepository.selectMemberPw(id, email).orElseThrow(() -> new NotFoundPwException("비밀번호를 찾을 수 없습니다"));
		
		log.info("findMember = {}", findMember);
		
		return findMember;
	
	}
	
	@Override
	public Member findMemberPw(String id, String newPassword) {
		
		Optional<Member> optionalFindMember = memberLoginRepository.selectMemberInfo(id);
		Member findMember = optionalFindMember.orElse(null);
		
		log.info("findMember = {}", findMember);
		
		return findMember;
	}
	
	@Override
	public Member findByIdx(int idx) {
		Optional<Member> optionalFindByIdxMember = memberLoginRepository.findByIdx(idx);
		Member findMember = optionalFindByIdxMember.orElse(null);
		
		log.info("findMember = {}", findMember);
		
		
		return findMember;
	}
	
	// 비밀번호 수정

	@Override
	public int updatePassword(String id, String password) {
		String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
		int result = memberLoginRepository.updateMemberPassword(hashpw, id);
		
		
		
		return result;
	}
	
	

	

	

	
}