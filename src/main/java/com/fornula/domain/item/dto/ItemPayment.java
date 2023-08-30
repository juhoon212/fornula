package com.fornula.domain.item.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPayment {
  
	private int photoIdx;
	private String itemfileName;
	private int itemIdx;
	private String itemName;
	private int price;

 
}
