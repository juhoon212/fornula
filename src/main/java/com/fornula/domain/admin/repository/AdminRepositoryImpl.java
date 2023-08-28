package com.fornula.domain.admin.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.mapper.java.AdminMapper;
import com.fornula.domain.item.dto.Item;
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
	public List<AdminMember> memberList() {
		return sql.getMapper(AdminMapper.class).memberList();
	}
	@Override
	public List<AdminItem> itemList() {
		return sql.getMapper(AdminMapper.class).itemList();
	}
	
	//관리자가 상품의 상태를 변경
	@Override
	public int updateItemStatus(int itemIdx) {
		return sql.getMapper(AdminMapper.class).updateItemStatus(itemIdx);
	}
	//관리자가 상품의 상태를 변경
	@Override
	public Item selectItemIdx() {
		return sql.getMapper(AdminMapper.class).selectItemIdx();
	}
	
}
