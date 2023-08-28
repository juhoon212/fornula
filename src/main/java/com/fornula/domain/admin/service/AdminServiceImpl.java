package com.fornula.domain.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.repository.AdminRepository;
import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

	private final AdminRepository adminRepository;
/*	
	@Override
	public int findId(Member member) {
		return adminRepository.findId(member);
	}

	@Override
	public int status(Member member) {
		return adminRepository.status(member);
	}
*/
	@Override
	public List<AdminMember> memberList() {
		return adminRepository.memberList();
	}
	@Override
	public List<AdminItem> itemList() {
		return adminRepository.itemList();
	}
	
	
	@Transactional(rollbackFor = Exception.class)
	//관리자가 상품의 상태를 변경
	@Override
	public void updateItemStatus(int itemIdx) {
		adminRepository.updateItemStatus(itemIdx);
			
		
	}
	
	

}
