package com.fornula.domain.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.LoginFailException;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.login.LoginForm;
import com.fornula.domain.member.service.MemberLoginService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberLoginController {
	
	private final MemberLoginService memberLoginService;
	
	@PostMapping("/login")
	public String login(@ModelAttribute LoginForm form, HttpServletRequest request, RedirectAttributes redirectAttributes) {
		
		Member loginMember = memberLoginService.login(form.getId(), form.getPassword());
		
		if(loginMember == null) {
			throw new LoginFailException("아이디 또는 비밀번호가 맞지 않습니다.");
		}
		
		HttpSession session = request.getSession();
		session.setAttribute(SessionConst.Login_member, loginMember);
		redirectAttributes.addAttribute("loginMember", loginMember.getId());
		
		return "redirect:/main";
		
		
		
	}
	
	
	
}
