package com.fornula.domain.member.service;

import java.util.List;
import com.fornula.domain.member.dto.mypage.Itempurchase;


public interface MypageItemService {

	  List<Itempurchase> mypageItemPurchase (int memberIdx);

}
