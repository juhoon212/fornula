package com.fornula.domain.member.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.MemberDTO;

public interface MemberJoinService {

	public void join(MemberDTO memberDTO);
}
