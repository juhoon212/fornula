package com.fornula.domain.admin.service;

import java.util.List;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.item.dto.Item;

public interface AdminService {

//	int findId(Member member); 
//	int status(Member member);
	List<AdminMember> memberList();
	List<AdminItem> itemList();
	
	//관리자가 상품의 상태를 변경
	void updateItemStatus(int itemIdx);
}
