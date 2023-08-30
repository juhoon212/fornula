package com.fornula.domain.member.mapper.java;

import java.util.List;
import com.fornula.domain.member.dto.mypage.Itempurchase;

public interface MypageItemMapper {
  List<Itempurchase> selectPurchaseMypage (int memberIdx);
  
}
