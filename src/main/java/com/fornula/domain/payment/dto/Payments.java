package com.fornula.domain.payment.dto;

import java.sql.Date;

import lombok.Data;

//create table payment(imp_uid varchar2(100) primary key
//, mercharnt_uid varchar2(100),pay_date date
//,userid varchar2(100),  amount number, item_idx number
//,status varchar2(20),
// purchase_idx     number          not null,
//    sales_idx        number          not null);

//결제 관련 정보를 저장하기 위한 클래스
@Data
public class Payments {
	private String impUid;//결제 관련 Open API에서 제공되는 고유값 
	private String merchantUid;//주문번호
	private long amount;//결제금액
	private Date payDate;//결제일 
	private String userid;//결제 사용자 아이디
	private int ItemIdx;//상품idx
	private String status;//결제 상태 
	private int purchaseIdx;
	private int salesIdx;
}