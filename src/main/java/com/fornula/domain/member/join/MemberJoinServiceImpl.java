package com.fornula.domain.member.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;

@Service
public class MemberJoinServiceImpl implements MemberJoinService {

	@Autowired
	private MemberJoinDAO memberJoinDAO;

	@Override
	public void insert(Member member) throws Exception {
		memberJoinDAO.insertMember(member);
	}
	
}
