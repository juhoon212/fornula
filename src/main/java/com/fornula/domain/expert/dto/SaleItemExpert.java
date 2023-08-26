package com.fornula.domain.expert.dto;

import com.fornula.domain.item.dto.Item;

import lombok.Data;

@Data
public class SaleItemExpert {
	private Sales sales;
	private Item item;
	private Expert expert;
}
