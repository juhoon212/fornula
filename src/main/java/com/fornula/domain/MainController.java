package com.fornula.domain;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

/*
 * 홈으로만 가는 컨트롤러 다른 것 작성 x
 */
@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String home() {
		return "main";
	}
}