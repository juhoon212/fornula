package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.ExistsExpertException;

@ControllerAdvice
public class ExpertException {
	@ExceptionHandler(value=ExistsExpertException.class)
	public String existsExpertException(ExistsExpertException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		return "expertjoin-success";
		
	}
}