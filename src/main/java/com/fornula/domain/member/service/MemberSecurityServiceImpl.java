package com.fornula.domain.member.service;

import java.util.List;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fornula.domain.exception.custom.NotFoundIdException;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MemberSecurityRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberSecurityServiceImpl implements MemberSecurityService {
	
	private final MemberSecurityRepository memberSecurityRepository;
	
	// 멤버 아이디로 추가
	@Override
	public int addSecurityMember(Member member) {
		int result = memberSecurityRepository.addSecurityMember(member);
		
		
		if(result == 0) {
			throw new UsernameNotFoundException("유저가 추가되지 않았습니다.");
		}
		
		return result;
	}
	
	//멤버 권한 추가
	@Override
	public int addAuth(Auth auth) {
		
		int result = memberSecurityRepository.addAuth(auth);
		
		return result;
	}
	
	// 멤버 찾기 
	@Override
	public List<Member> findSecurityMemberById(String id) {
		
		List<Member> memberList = memberSecurityRepository.findSecurityMemberById(id);
		
		if(memberList.isEmpty()) {
			throw new NotFoundIdException("아이디로 찾을 수 없습니다.");
		}
		
		return memberList;
	}

	@Override
	   public Member getSecurityMember(String id) {
	      return memberSecurityRepository.findMemberById(id);
	   }

}
