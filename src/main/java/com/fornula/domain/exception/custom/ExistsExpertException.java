package com.fornula.domain.exception.custom;

import com.fornula.domain.expert.dto.Expert;

import lombok.Getter;

//전문가 등록이 두번 되었을 때 예외처리
public class ExistsExpertException extends Exception {
	private static final long serialVersionUID = 1L;
	
	@Getter
	private Expert expert;
	
	public ExistsExpertException() {

	}
	public ExistsExpertException(String message) {
		super(message);
	}
	
}