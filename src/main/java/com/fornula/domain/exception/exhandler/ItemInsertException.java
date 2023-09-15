package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.ExistsItemException;

@ControllerAdvice
public class ItemInsertException {
	@ExceptionHandler(value=ExistsItemException.class)
	public String existsItemException(ExistsItemException itemException, Model model) {
		model.addAttribute("message", itemException.getMessage());
		return "/item/success";
	}
}
