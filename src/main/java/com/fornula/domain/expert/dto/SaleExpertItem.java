package com.fornula.domain.expert.dto;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

import lombok.Data;

@Data
public class SaleExpertItem {
	private Sales sales;
	private Item item;
	private Photo photo;
	
}
