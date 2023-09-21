package com.fornula.domain.exception.custom;

public class NoAuthReplyException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoAuthReplyException() {
		super();
	}
	
	public NoAuthReplyException(String message) {
		super(message);
	}
	
	public NoAuthReplyException(String message, int memberIdx, int itemIdx) {
		super(message);
	}


}
