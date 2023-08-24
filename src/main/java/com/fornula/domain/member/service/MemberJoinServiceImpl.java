package com.fornula.domain.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.MemberDTO;
import com.fornula.domain.member.repository.MemberJoinRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberJoinServiceImpl implements MemberJoinService{
	
	
	private MemberJoinRepository memberJoinRepository;

	@Override
	public void join(MemberDTO memberDTO) {
		
		memberJoinRepository.join(memberDTO);
	}
	
}
