package com.fornula.domain.expert.dto;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;

import lombok.Data;

//구매내역 테이블에서 상태값을 가져와 상품테이블을 거쳐 전문가테이블의 상태로 가져오는 다중 조인 DTO
@Data
public class SaleItemExpert {
	private Sales sales;
	private Item item;
	private  Purchase purchas;
}
