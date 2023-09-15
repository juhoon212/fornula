package com.fornula.domain.item.dto.itemdetail;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPhoto {
	private Item item;
	private Photo photo;
}
