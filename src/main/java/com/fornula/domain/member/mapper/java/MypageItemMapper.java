package com.fornula.domain.member.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.member.dto.mypage.Itempurchase;

public interface MypageItemMapper {
   List<Itempurchase> selectPurchaseMypage (Map<String, Object> map);
   int selectPurchaseCount();
}