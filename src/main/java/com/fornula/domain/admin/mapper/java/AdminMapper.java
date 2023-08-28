package com.fornula.domain.admin.mapper.java;

import java.util.List;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;

public interface AdminMapper {
	
//	int findId(Member member); 
//	int status(Member member);
	
	List<AdminMember> memberList();
	List<AdminItem> itemList();
}
