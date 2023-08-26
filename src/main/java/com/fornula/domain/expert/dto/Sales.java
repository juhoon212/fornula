package com.fornula.domain.expert.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*    
------------ -------- ------ 
SALES_IDX    NOT NULL NUMBER 
ITEM_IDX     NOT NULL NUMBER 
SALES_DATE   NOT NULL DATE   
SALES_STATUS NOT NULL NUMBER  
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sales {
	private int salesIdx;
	private int itemIdx;
	private String salesDate;
	private int salesStatus;
}
