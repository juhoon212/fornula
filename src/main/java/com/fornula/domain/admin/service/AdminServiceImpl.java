package com.fornula.domain.admin.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.repository.AdminRepository;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.pager.Pager;

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
	@Override
	public List<AdminMember> memberList() {
		return adminRepository.memberList();
	}
	@Override
	public List<AdminItem> itemList() {
		return adminRepository.itemList();
	}
	
 */
	


	@Override
	public Map<String, Object> memberList(int pageNum) {
		int totalBoard=adminRepository.memberListCount();
		int pageSize=10; // 출력 갯수
		int blockSize=10;
		
		Pager pager=new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		List<AdminMember> memberList=adminRepository.memberList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("memberList", memberList);
		
		return resultMap;
	}
	
	
	@Override
	public Map<String, Object> itemList(int pageNum) {
		int totalBoard=adminRepository.itemListCount();
		int pageSize=10;
		int blockSize=10;
		
		
		Pager pager=new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		List<AdminItem> itemList=adminRepository.itemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("itemList", itemList);
		
		return resultMap;
	}
	
	
	



	

}
