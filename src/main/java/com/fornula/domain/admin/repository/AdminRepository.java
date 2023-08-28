package com.fornula.domain.admin.repository;

import java.util.List;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.item.dto.Item;

public interface AdminRepository {


//	int findId(Member member); 
//	int status(Member member);
	
	List<AdminMember> memberList();
	List<AdminItem> itemList();
	
	
	//관리자가 상품의 상태 수정(삭제처리)
	int updateItemStatus(int itemIdx);
	
}
