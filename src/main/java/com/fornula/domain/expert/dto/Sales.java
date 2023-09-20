package com.fornula.domain.expert.dto;

import java.sql.Date;

import com.fornula.domain.item.dto.vo.ItemUpdateForm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
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
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Sales {
	private int salesIdx; 
	private int itemIdx;
	private Date salesDate;
	private int salesStatus;
}
