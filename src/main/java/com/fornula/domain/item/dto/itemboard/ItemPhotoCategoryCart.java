package com.fornula.domain.item.dto.itemboard;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//ItemBoardMapper에서 테이블 조인을 하기 때문에 만드는 DTO클래스임
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPhotoCategoryCart {
	private Item item;
	private Photo photo;
}
