package com.fornula.domain.exception.exhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.fornula.domain.exception.custom.NoAuthReplyException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ReviewExHandler {
	
	@ExceptionHandler(NoAuthReplyException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String loginFailExHandle(NoAuthReplyException e, Model model) {
		log.info("[NoAuthReplyException] ", e);
		model.addAttribute("message", e.getMessage());
		return "reply";
	}
}
