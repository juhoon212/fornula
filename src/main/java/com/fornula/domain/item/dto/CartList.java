package com.fornula.domain.item.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CartList {
	private int itemIdx;
	private String itemName;
	private String itemContent;
	private int price;
	private String itemfileName;
}
