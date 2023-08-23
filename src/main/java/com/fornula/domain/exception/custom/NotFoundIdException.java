package com.fornula.domain.exception.custom;

public class NotFoundIdException extends RuntimeException{
	
	
	public NotFoundIdException() {
		super();
	}
	
	public NotFoundIdException(String message) {
		super(message);
	}
}
