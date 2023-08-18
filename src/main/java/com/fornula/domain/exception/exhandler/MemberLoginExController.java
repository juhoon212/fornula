package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.LoginFailException;

@ControllerAdvice
public class MemberLoginExController {
	
	@ExceptionHandler(value = LoginFailException.class)
	public String loginExHandler(RuntimeException exception, Model model) {
		
		model.addAttribute("message", exception.getMessage());
		return "main#";
	}

}
