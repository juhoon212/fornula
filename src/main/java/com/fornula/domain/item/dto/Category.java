package com.fornula.domain.item.dto;

import lombok.Data;

/**
 * 
 * 이름           널?       유형           
------------ -------- ------------ 
CATEGORY_IDX NOT NULL NUMBER       
LARGE        NOT NULL VARCHAR2(50) 
SMALL        NOT NULL VARCHAR2(50) 
 *
 */


@Data
public class Category {
	
	private int categoryIdx;
	private String large;
	private String small;
}
