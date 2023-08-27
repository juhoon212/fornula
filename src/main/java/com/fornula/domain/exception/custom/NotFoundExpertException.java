package com.fornula.domain.exception.custom;

public class NotFoundExpertException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	
	
	public NotFoundExpertException() {
		
	}
	
	public NotFoundExpertException(String message) {
		super(message);
	}
	
	

}
