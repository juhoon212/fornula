package com.fornula.domain.item.dto.itemPayment;

import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.Member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemSalesSuccess {
	private int salesIdx;
	private int itemIdx;
	private String salesDate;
	private int salesStatus;
}
