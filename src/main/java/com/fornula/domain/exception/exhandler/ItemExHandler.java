package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.ItemNotFoundException;

@ControllerAdvice
public class ItemExHandler {
		
	@ExceptionHandler(ItemNotFoundException.class)
	public String itemNotFoundException(ItemNotFoundException exception, Model model) {
		
		model.addAttribute("status", false);
		model.addAttribute("message", "찾으시는 상품을 찾을 수 없습니다");
		
		return "/error";
	}
}
