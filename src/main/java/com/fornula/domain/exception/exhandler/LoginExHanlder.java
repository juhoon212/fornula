package com.fornula.domain.exception.exhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fornula.domain.exception.ErrorResult;
import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.exception.custom.LoginUserCheckException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice(basePackages = "com.fornula.domain")
@Slf4j
public class LoginExHanlder {
	
	@ExceptionHandler(LoginFailException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResult LoginFailExHandle(LoginFailException e) {
		log.info("[LoginFailException] ", e);
		return new ErrorResult("Bad", e.getMessage());
	}
	
	@ExceptionHandler(LoginUserCheckException.class)
	public String loginUserCheckException(LoginUserCheckException e) {
		
		log.info("REQUEST URL = {}", e.getMessage()); // 들어온 요청 URL
		
		return "redirect:/" + e.getMessage();
	}
	
	
}
