package com.fornula.domain.admin.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;


public interface AdminRepository {


//	int findId(Member member); 
//	int status(Member member);
	
//	List<AdminMember> memberList();
	List<AdminMember> memberList(Map<String, Object> map);
	int memberListCount();
	int updateMemberStatus(int memberIdx);

	List<AdminItem> itemList(Map<String, Object> map);
	int itemListCount();
	int updateItemStatus(int itemIdx);
}
