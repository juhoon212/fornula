package com.fornula.domain.member.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.repository.MemberJoinRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberJoinServiceImpl implements MemberJoinService{
	
	private final MemberJoinRepository memberJoinRepository;

	@Override
	public Member idCheck(String id) {
		Optional<Member> optionalFindMember = memberJoinRepository.idCheck(id);
		Member findMember = optionalFindMember.orElse(null);
		
		return findMember;
	}

	
	
	
}
