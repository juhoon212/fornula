package com.fornula.domain.item.dto;

import lombok.Data;

/**
 * 
 * �씠由�           �꼸?       �쑀�삎           
------------ -------- ------------ 
CATEGORY_IDX NOT NULL NUMBER       
LARGE        NOT NULL VARCHAR2(50) 
SMALL        NOT NULL VARCHAR2(50) 
 *
 */



public class Category {
	
	private int categoryIdx;
	private String large;
	private String small;
}
