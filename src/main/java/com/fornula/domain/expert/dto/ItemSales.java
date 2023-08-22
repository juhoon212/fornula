package com.fornula.domain.expert.dto;

import com.fornula.domain.item.dto.Item;

import lombok.Data;

@Data
public class ItemSales {
	//1:1 ¡∂¿Œ
	private Sales sales;
	private Item item;
}
