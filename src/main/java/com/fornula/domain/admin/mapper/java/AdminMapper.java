package com.fornula.domain.admin.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;

public interface AdminMapper {
	
//	int findId(Member member); 
//	int status(Member member);
	
//	List<AdminMember> memberList();
//	List<AdminItem> itemList();
	List<AdminMember> memberList(Map<String, Object> map);
	int memberListCount();

	List<AdminItem> itemList(Map<String, Object> map);
	int itemListCount();
	
	
}
