package com.fornula.domain.item.dto;

import lombok.Data;

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
 */

@Data
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
