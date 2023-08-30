package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.mypage.ItemExpert;
import com.fornula.domain.member.repository.MypageItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageItemServiceImpl implements MypageItemService{
	
	private final MypageItemRepository mypageItemRepository;
	
	@Override
	public Purchase mypageItemPurchase(int memberIdx) {
		Purchase mypageItemPurchase = mypageItemRepository.selectPurchaseMypage(memberIdx);
		return mypageItemPurchase;
	}

	
  
}
