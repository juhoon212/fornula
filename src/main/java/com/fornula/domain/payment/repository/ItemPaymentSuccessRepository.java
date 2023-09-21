package com.fornula.domain.payment.repository;

import org.apache.ibatis.annotations.Param;


public interface ItemPaymentSuccessRepository {
	int insertPurchaseItem(@Param("itemIdx")int itemIdx,@Param("memberIdx") int memberIdx);
    int insertSalesItem(int itemIdx);

}
