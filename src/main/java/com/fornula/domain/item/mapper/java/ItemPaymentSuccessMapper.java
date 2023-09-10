package com.fornula.domain.item.mapper.java;

import org.apache.ibatis.annotations.Param;


public interface ItemPaymentSuccessMapper {
 int insertPurchaseItem(@Param("itemIdx")int itemIdx,@Param("memberIdx") int memberIdx);
 int insertSalesItem(@Param("itemIdx") int itemIdx);

}