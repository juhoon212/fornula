package com.fornula.domain.member.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Member;

@Repository
public class MemberJoinDAOImpl implements MemberJoinDAO {

	@Autowired
	private SqlSession session;

	@Override
	public void insertMember(Member member) {
		session.insert("insertMember",member);
	}
}
