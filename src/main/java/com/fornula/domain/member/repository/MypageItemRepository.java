package com.fornula.domain.member.repository;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.mypage.ItemExpert;

public interface MypageItemRepository {

	Purchase selectPurchaseMypage (int memberIdx);
	ItemExpert selectItemMypage (int memberIdx);
}
