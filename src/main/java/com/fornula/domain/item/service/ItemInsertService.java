package com.fornula.domain.item.service;

import com.fornula.domain.item.dto.Item;

public interface ItemInsertService {
	public Item insertItem(int categoryIdx,int expertIdx,String itemName,String itemContent,int price);
	
}
