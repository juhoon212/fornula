package com.fornula.domain.exception.custom;


public class LoginUserCheckException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public LoginUserCheckException() {
		super();
	}
	
	public LoginUserCheckException(String message) {
		super(message);
	}
	
	
}
