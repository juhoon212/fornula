package com.fornula.domain.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * �씠由�           �꼸?       �쑀�삎           
------------ -------- ------------ 
CATEGORY_IDX NOT NULL NUMBER       
LARGE        NOT NULL VARCHAR2(50) 
SMALL        NOT NULL VARCHAR2(50) 
 *
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	private int categoryIdx;
	private String large;
	private String small;
}
