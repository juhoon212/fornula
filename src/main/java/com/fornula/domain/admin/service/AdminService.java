package com.fornula.domain.admin.service;

import java.util.List;
import java.util.Map;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;

public interface AdminService {

//	int findId(Member member); 
//	int status(Member member);
	
//	List<AdminMember> memberList();
//	List<AdminItem> itemList();
	
	Map<String, Object> memberList(int pageNum);
	void updateMemberStatus(int memberIdx);
	
	Map<String, Object> itemList(int pageNum);
	void updateItemStatus(int itemIdx);
}
