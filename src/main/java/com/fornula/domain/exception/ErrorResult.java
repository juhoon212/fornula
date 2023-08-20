package com.fornula.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class ErrorResult {
	
	private String errorCode;
	private String message;
	

	
	
	
}
