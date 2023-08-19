package com.fornula.domain.member.restcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.exception.ErrorResult;
import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.member.dto.Interest;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.login.LoginForm;
import com.fornula.domain.member.service.MemberLoginService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/member")
@Slf4j
@RequiredArgsConstructor
public class MemberLoginRestController {
	
	private final MemberLoginService memberLoginService;
	
	
	@PostMapping("/login")
	public Member login(@ModelAttribute LoginForm form, HttpServletRequest request) {
		
		Member loginMember = memberLoginService.login(form.getId(), form.getPassword());
		
		HttpSession session = request.getSession();
		session.setAttribute(SessionConst.Login_Member, loginMember);
		
		log.info("member = {}",loginMember.getId());
		
		
		return loginMember;
	}
	
	
	
	
	
	
	
}
