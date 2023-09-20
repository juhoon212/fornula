package com.fornula.domain.item.dto.itemdetail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPhotoForExpert {
	private int itemIdx;
	private int categoryIdx;
	private int expertIdx;
	private String itemName;
	private String itemContent;
	private int price;
	private String itemDate;
	private String itemfileName;
}
