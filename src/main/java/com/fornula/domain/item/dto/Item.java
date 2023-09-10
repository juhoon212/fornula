package com.fornula.domain.item.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;

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
	
    @Min(value = 1, message = "카테고리를 다시 선택해주세요")
    @Max(value = 10, message = "카테고리를 다시 선택해주세요")
	private int categoryIdx;
    
	private int expertIdx;
	
    @Size(max = 30, message = "30 글자 이상 입력할 수 없습니다.")
	private String itemName;
    
    @Size(max = 500, message = "500 글자 이상 입력할 수 없습니다.")
	private String itemContent;
    
    @Min(value = 1, message = "1 이상의 값이어야 합니다.")
	private int price;
	private int itemStatus;
	private String itemDate;
}
