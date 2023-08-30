package com.fornula.domain.member.mapper.java;

import java.util.List;

import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.mypage.ItemExpert;

public interface MypageItemMapper {
  Purchase selectPurchaseMypage (int memberIdx);
  //ItemExpert selectItemMypage (int memberIdx);
  
}
