package com.fornula.domain.item.dto;

import lombok.Data;

/**
  이름             널?       유형           
-------------- -------- ------------ 
PAYMENT_IDX    NOT NULL NUMBER       
PAYMENT_OPTION NOT NULL VARCHAR2(50) 
PAYMENT_BANK   NOT NULL VARCHAR2(50) 
PAYMENT_PRICE  NOT NULL NUMBER       
PURCHASE_IDX   NOT NULL NUMBER       
SALES_IDX      NOT NULL NUMBER       
 
*/ 
@Data

public class Payment {
	private int paymentIdx;
	private String paymentOption;
	private String paymentBank;
	private int paymentPrice;
	private int purchaseIdx;
	private int salesIdx;
}
