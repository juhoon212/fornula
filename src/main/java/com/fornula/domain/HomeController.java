package com.fornula.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	   @GetMapping("/home")
	   public String home() {
	      log.info("Homecontroller = {}", HomeController.class);
	      return "main";
	   }
	   
	   @GetMapping("/item")
	   public String item() {
	      log.info("Homecontroller = {}", HomeController.class);
	      return "item-add";
	   }
	   
	   @GetMapping("/mypage")
	   public String mypage() {
	      log.info("Homecontroller = {}", HomeController.class);
	      return "my-page";
	   }
	   
	   @GetMapping("/mypage2")
	   public String mypage2() {
	      log.info("Homecontroller = {}", HomeController.class);
	      return "my-page2";
	   }
	   
	   @GetMapping("/items")
	   public String items() {
		   return "items";
	   }
	   

	   @GetMapping("/itemboard")
	   public String itemboard() {
		   return "item-board";
	   }
	   

	   @GetMapping("/reviewform")
	   public String reviews() {
		  return "review-form";
	   }
	   
	   @GetMapping("/expertinfo")
	   public String exportInfo() {
		   return "expert-info";
	   }
	   
	   @GetMapping("/exportjoin")
	   public String exportJoin() {
		   return "export-join";
	   }
	   
	   
	   
	   @GetMapping("/test")
	   @ResponseBody
	   public String test() {
	      return "ok";
	   }

}
