package com.fornula.domain.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.repository.MypageItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageItemServiceImpl implements MypageItemService{
	
	private final MypageItemRepository mypageItemRepository;
	
	@Override
	public List<Itempurchase>  mypageItemPurchase(int memberIdx) {
		List<Itempurchase> mypageItemPurchase = mypageItemRepository.selectPurchaseMypage(memberIdx);
		return mypageItemPurchase;
	}

	//@Override
	//public int modifyPurchaseStatus(Itempurchase itempurchase) {
	
	//	return mypageItemRepository.updatePurchaseStatus(itempurchase);
	//}

	
  
}
