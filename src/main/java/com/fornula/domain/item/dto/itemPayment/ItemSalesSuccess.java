package com.fornula.domain.item.dto.itemPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemSalesSuccess {
	private int salesIdx;
	private int itemIdx;
	private String salesDate;
	private int salesStatus;
}
