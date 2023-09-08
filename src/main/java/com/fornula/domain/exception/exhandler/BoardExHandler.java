package com.fornula.domain.exception.exhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fornula.domain.exception.custom.NoAuthReplyException;
import com.fornula.domain.exception.custom.NotFoundPurchaseException;
import com.fornula.domain.exception.custom.NotFoundReviewException;

@ControllerAdvice
public class BoardExHandler {
	
	@ExceptionHandler(value = NotFoundPurchaseException.class)
	public String notFoundPurchase(NotFoundPurchaseException exception, Model model) {
		
		model.addAttribute("message", exception.getMessage());
		return "error";
	}
	
	@ExceptionHandler(value = NoAuthReplyException.class)
	public String noAuthReplyException(NoAuthReplyException exception, Model model) {
		
		model.addAttribute("message", exception.getMessage());
		return "error";
	}
	
	@ExceptionHandler(value = NotFoundReviewException.class)
	public String noAuthReplyException(NotFoundReviewException exception, Model model) {
		
		model.addAttribute("message", exception.getMessage());
		return "error";
	}
}
