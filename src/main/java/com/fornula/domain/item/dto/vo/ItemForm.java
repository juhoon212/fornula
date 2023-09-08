package com.fornula.domain.item.dto.vo;


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
public class ItemForm {
	
	private int expertIdx;
	private int categoryIdx;
	private String itemName;
	private String itemContent;
	private int price;
}
