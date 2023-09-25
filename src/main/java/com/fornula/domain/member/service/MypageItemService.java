package com.fornula.domain.member.service;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.member.dto.mypage.Itempurchase;


public interface MypageItemService {

	Map<String, Object> getPurchasesList(int pageNum, int memberIdx);
	int getPurchasesCount();
	  
}
