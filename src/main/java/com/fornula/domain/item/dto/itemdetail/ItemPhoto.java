package com.fornula.domain.item.dto.itemdetail;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

import lombok.Data;

@Data
public class ItemPhoto {
	private Item item;
	private Photo photo;
}
