package com.fornula.domain.payment.service;

import com.fornula.domain.payment.dto.Payments;

public interface PaymentsService {
  void PaymentSalesSuccess(int itemIdx);
  void PaymentPurchaseSuccess(int itemIdx,int memberIdx);
  //void addPayment(Payments payment);
  //void modifyPayment(Payments payment);
  
  String getAccessToken(Payments payment);
  Payments getPayment(String accessToken, String impUid) ;
  String cancelPayment(String accessToken,Payments payment);
  
  
}
