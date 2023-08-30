package com.fornula.domain.item.service;


public interface ItemPaymentSuccessService {
   void PaymentSalesSuccess(int itemIdx);
   void PaymentPurchaseSuccess(int itemIdx,int memberIdx);
  
}
