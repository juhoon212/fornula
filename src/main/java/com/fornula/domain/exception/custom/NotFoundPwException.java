package com.fornula.domain.exception.custom;

public class NotFoundPwException extends RuntimeException{
	
	
	public NotFoundPwException() {
		super();
	}
	
	public NotFoundPwException(String message) {
		super(message);
	}
}
