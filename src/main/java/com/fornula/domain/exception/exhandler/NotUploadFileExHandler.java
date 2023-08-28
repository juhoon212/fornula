package com.fornula.domain.exception.exhandler;

import java.io.IOException;

import javax.crypto.Mac;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.fornula.domain.exception.ErrorResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice("com.fornula.domain.expert")
public class NotUploadFileExHandler {
	@ExceptionHandler({IOException.class, IllegalStateException.class})
	public String NotUploadFileException(RuntimeException e) {
		log.info("[NotUploadFileException]", e);
		return "upload-fail";
		
	}
}
