package com.fornula.domain.exception.exhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fornula.domain.exception.ErrorResult;
import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.exception.custom.LoginUserCheckException;
import com.fornula.domain.exception.custom.NotFoundPwException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class LoginExHandler {
	
	
}
