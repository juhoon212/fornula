package com.fornula.domain.exception.custom;

public class ItemNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ItemNotFoundException() {
		
	}
	public ItemNotFoundException(String message) {
		super(message);
	}
}