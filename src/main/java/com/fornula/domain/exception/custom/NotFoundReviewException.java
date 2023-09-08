package com.fornula.domain.exception.custom;


public class NotFoundReviewException extends RuntimeException{
	
	public NotFoundReviewException() {
		super();
	}
	
	public NotFoundReviewException(String message) {
		super(message);
	}
}
