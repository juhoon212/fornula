package com.fornula.domain.expert.dto;

import com.fornula.domain.item.dto.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemSales {
	private Sales sales;
	private Item item;
}
