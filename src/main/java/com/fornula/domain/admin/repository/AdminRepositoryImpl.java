package com.fornula.domain.admin.repository;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.mapper.java.AdminMapper;
import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AdminRepositoryImpl implements AdminRepository{

	private final SqlSession sql;
	/*
	@Override
	public int findId(Member member) {
		return sql.getMapper(AdminMemberMapper.class).findId(member);
	}

	@Override
	public int status(Member member) {
		return sql.getMapper(AdminMemberMapper.class).status(member);
	}

	 */
	
	@Override
	public List<AdminMember> memberList(Map<String, Object> map) {
		return sql.getMapper(AdminMapper.class).memberList(map);
	}
	
	@Override
	public int memberListCount() {
		return sql.getMapper(AdminMapper.class).memberListCount();
	}

	@Override
	public int updateMemberStatus(int memberIdx) {
		return sql.getMapper(AdminMapper.class).updateMemberStatus(memberIdx);
	}
	
	@Override
	public List<AdminItem> itemList(Map<String, Object> map) {
		return sql.getMapper(AdminMapper.class).itemList(map);
	}

	@Override
	public int itemListCount() {
		return sql.getMapper(AdminMapper.class).itemListCount();
	}


	@Override
	public int updateItemStatus(int itemIdx) {
		return sql.getMapper(AdminMapper.class).updateItemStatus(itemIdx);
	}
	
	


}
