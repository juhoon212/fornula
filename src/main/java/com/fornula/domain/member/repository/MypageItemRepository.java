package com.fornula.domain.member.repository;

import java.util.List;
import com.fornula.domain.member.dto.mypage.Itempurchase;

public interface MypageItemRepository {

	  List<Itempurchase> selectPurchaseMypage (int memberIdx);
}
