package com.fornula.domain.item.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemForm {
	
	private int expertIdx;
	private int categoryIdx;
	private String itemName;
	private String itemContent;
	private int price;
}
