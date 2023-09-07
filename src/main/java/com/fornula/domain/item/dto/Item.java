package com.fornula.domain.item.dto;

import com.fornula.domain.member.dto.vo.IdCheckForm;

import lombok.AllArgsConstructor;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
  이름           널?       유형             
------------ -------- -------------- 
ITEM_IDX     NOT NULL NUMBER         
CATEGORY_IDX NOT NULL NUMBER         
EXPERT_IDX   NOT NULL NUMBER         
ITEM_NAME    NOT NULL VARCHAR2(100)  
ITEM_CONTENT NOT NULL VARCHAR2(3000) 
PRICE        NOT NULL NUMBER         
ITEM_STATUS  NOT NULL NUMBER         
ITEM_DATE    NOT NULL DATE 
PHOTO_IDX	 NOT NULL NUMBER 
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	private int itemIdx;
	private int categoryIdx;
	private int expertIdx;
	private String itemName;
	private String itemContent;
	private int price;
	private int itemStatus;
	private String itemDate;
}
