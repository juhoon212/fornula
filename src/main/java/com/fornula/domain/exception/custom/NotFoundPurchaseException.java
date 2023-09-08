package com.fornula.domain.exception.custom;

public class NotFoundPurchaseException extends RuntimeException{
	
	public NotFoundPurchaseException() {
		super();
	}
	
	public NotFoundPurchaseException(String message) {
		super(message);
	}
}
