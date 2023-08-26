package com.fornula.domain.member.mapper.java;

import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.mypage.ItemExpert;

public interface MypageItemMapper {
  Purchase selectPurchaseMypage (int memberIdx);
  ItemExpert selectItemMypage (int memberIdx);
  
}
