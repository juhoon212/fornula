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
import com.fornula.domain.exception.custom.NotFoundExpertException;
import com.fornula.domain.exception.custom.NotFoundIdException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice(basePackages = "com.fornula.domain")
@Slf4j
public class RestLoginExHanlder {
	
	@ExceptionHandler(LoginFailException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResult loginFailExHandle(LoginFailException e) {
		log.info("[LoginFailException] ", e);
		return new ErrorResult("Bad", e.getMessage());
	}
	
	// NotFoundIDException
	
	@ExceptionHandler(NotFoundIdException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResult notFoundIdException(NotFoundIdException e) {
		log.info("[NotFoundIdException]", e);
		return new ErrorResult("Bad", e.getMessage());
	}
	
	@ExceptionHandler(NotFoundExpertException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResult notFoundExpertException(NotFoundExpertException e) {
		log.info("[NotFoundExpertException]", e);
		return new ErrorResult("Bad", e.getMessage());
	}
	
	
	
	
	
	
	
	
	
}
