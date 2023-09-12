package com.fornula.domain.exception.custom;

import com.fornula.domain.item.dto.Item;

import lombok.Getter;

// 상품 등록이 여러번 되었을 때 발생하는 예외
public class ExistsItemException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Getter
	private Item item;
	
	public ExistsItemException() {
		// TODO Auto-generated constructor stub
	}
	public ExistsItemException(String message) {
		super(message);
	}
}
