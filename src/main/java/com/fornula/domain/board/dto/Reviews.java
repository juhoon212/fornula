package com.fornula.domain.board.dto;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	
	private Review review;
	private Item item;
	private Purchase purchase;
}
