package com.fornula.domain.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.repository.MypageItemRepository;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageItemServiceImpl implements MypageItemService{
	
	private final MypageItemRepository mypageItemRepository;

	@Override
	public Map<String, Object> getPurchasesList(int pageNum, int memberIdx) {
		int totalSales = mypageItemRepository.selectPurchaseCount();
		
		Pager pager = new Pager(pageNum, totalSales, 3, 6);
		
		//mapper에서 받을 값
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		pageMap.put("memberIdx", memberIdx);
		
		List<Itempurchase> Itempurchase = mypageItemRepository.selectPurchaseMypage(pageMap);
		
		
		//컨트롤러에 전달될 map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("Itempurchase", Itempurchase);
		resultMap.put("pager", pager);
		
		return resultMap;
	}

	@Override
	public int getPurchasesCount() {
		
		return mypageItemRepository.selectPurchaseCount();
	}
	

}
