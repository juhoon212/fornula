package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.exception.custom.MypagePwException;


@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value = MypageIdExcepion.class)	
	public String MypageIdExcepion(MypageIdExcepion exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		
		return "mypage-secession";
	}
	
	@ExceptionHandler(value = MypagePwException.class)	
	public String MypagePwException(MypagePwException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		
		return "mypage-pwchange";
	}
	
}
