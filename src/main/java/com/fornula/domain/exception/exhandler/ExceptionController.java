package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.MypageIdExcepion;


@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value = MypageIdExcepion.class)	
	public String existsUserinfoExceptionHander(MypageIdExcepion exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		
		return "main";
	}
	
}
