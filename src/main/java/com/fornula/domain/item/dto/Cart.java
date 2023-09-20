package com.fornula.domain.item.dto;

import lombok.Data;

/*
이름             널?       유형     
-------------- -------- ------ 
CART_IDX       NOT NULL NUMBER 
MEMBER_IDX     NOT NULL NUMBER 
ITEM_IDX       NOT NULL NUMBER 
ITEM_PHOTO_IDX NOT NULL NUMBER 
*/

@Data
public class Cart {
	private int cartIdx;
	private int memberIdx;
	private int itemIdx;
	private int itemPhotoIdx;
	private String cartDate;
	private int cartStatus;
}
