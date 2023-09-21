package com.fornula.domain.payment.mapper;

import org.apache.ibatis.annotations.Param;


public interface ItemPaymentSuccessMapper {
 int insertPurchaseItem(@Param("itemIdx")int itemIdx,@Param("memberIdx") int memberIdx);
 int insertSalesItem(@Param("itemIdx")int itemIdx);

}
