package com.fornula.domain.exception.custom;

import java.io.IOException;

public class NotUploadFileException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NotUploadFileException() {
		super();
	} 
	public NotUploadFileException(String message) {
		super(message);
	}
}
