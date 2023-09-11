package com.fornula.domain.expert.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TotalSalesMoney {
	private int salesIdx;
	private String salesDate;
	private int salesStatus;
	private int itemIdx;
	private String itemName;
	private int price;
	private String itemContent;
}
