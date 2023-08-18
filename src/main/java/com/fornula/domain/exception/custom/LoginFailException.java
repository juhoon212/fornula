package com.fornula.domain.exception.custom;

import com.fornula.domain.member.dto.Member;

import lombok.Getter;

public class LoginFailException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Getter
	private Member member;

	public LoginFailException(String message) {
		super(message);
	}
	
	
	
}
