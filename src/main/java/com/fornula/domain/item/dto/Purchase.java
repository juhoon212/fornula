package com.fornula.domain.item.dto;

import lombok.Data;

/*
이름              널?       유형     
--------------- -------- ------ 
PURCHASE_IDX    NOT NULL NUMBER 
ITEM_IDX        NOT NULL NUMBER 
MEMBER_IDX      NOT NULL NUMBER 
PURCHASE_DATE   NOT NULL DATE   
PURCHASE_STATUS NOT NULL NUMBER 
 */

@Data

public class Purchase {
	private int purchaseIdx;
	private int itemIdx;
	private int memberIdx;
	private String purchaseDate;
	private int purchaseStatus;
}
