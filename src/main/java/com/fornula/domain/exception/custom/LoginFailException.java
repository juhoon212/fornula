package com.fornula.domain.exception.custom;

public class LoginFailException extends RuntimeException{

	/**
	 * 
	 */
	
	public LoginFailException() {
		super();
	}
 
	
	public LoginFailException(String message) {
		super(message);
	}
	
	
}
