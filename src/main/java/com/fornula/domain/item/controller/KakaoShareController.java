
package com.fornula.domain.item.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class KakaoShareController {
 
	@GetMapping("/kakao")
	public String getItemBoardList() {
	    
	    return "kakao-share";
	}
}