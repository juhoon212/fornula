package com.fornula.domain.member.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.member.dto.mypage.Itempurchase;

public interface MypageItemRepository {

	 List<Itempurchase> selectPurchaseMypage (Map<String, Object> map);
	 int selectPurchaseCount();
}
