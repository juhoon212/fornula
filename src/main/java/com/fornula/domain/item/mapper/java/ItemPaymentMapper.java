package com.fornula.domain.item.mapper.java;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.item.dto.Item;

public interface ItemPaymentMapper {
 int insertPurchaseItem(@Param("itemIdx")int itemIdx,@Param("memberIdx") int memberIdx);
 int insertSalesItem(int itemIdx);
 Item selectItemPayment(int itemIdx);
}
