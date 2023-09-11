package com.fornula.domain.item.dto.vo;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ItemUpdateForm {
	
	
	private int itemIdx;
	
	private int categoryIdx;
	
	private int expertIdx;
	
	@Size(min = 10, max = 100, message = "상품 이름 : 10자 이상 100자 이하로 입력하세요")
	private String itemName;
	@Size(min = 10, max = 10000000, message = "상품 내용 : 10자 이상 100만자 이하로 입력하세요")
	private String itemContent;
	
	@Min(value = 1000, message = "가격 : 1000원 이상으로 입력해주세요")
	@Max(value = 1000000000, message = "가격 : 상품 금액이 초과되었습니다.")
	private int price;
	
	private int itemStatus;
	
	
	private String itemDate;
}

