package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fornula.domain.exception.ErrorResult;
import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.member.dto.join.Message;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class ItemExHandler {
		
	@ExceptionHandler(ItemNotFoundException.class)
	public ErrorResult itemNotFoundException(ItemNotFoundException exception, Model model) {
		
		log.info("ITEMNOTFOUNDEXCEPTION 발생 ", exception);
		 
		return new ErrorResult("Bad", exception.getMessage());
	}
}
