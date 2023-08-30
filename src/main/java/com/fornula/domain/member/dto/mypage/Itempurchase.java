package com.fornula.domain.member.dto.mypage;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Itempurchase {
	private int purchaseIdx;
	private String purchaseDate;
	private int purchaseStatus;
	private int itemIdx;
	private String itemName;
	private String itemContent;
	private int price;
	
}
