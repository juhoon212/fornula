package com.fornula.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.login.FindPasswordForm;
import com.fornula.domain.member.service.MemberLoginService;

import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberLoginService memberLoginService;
	
	
	// 회원가입 폼
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	// 아이디 찾기
	@GetMapping("/findId")
	public String showFindId() {
		return "find-id";
	}
	
	
	// 비밀번호 찾기
	@GetMapping("/findPw")
	public String findPw() {
		return "find-pw";
	}
	
	@GetMapping("/findNewPw")
	public String findNewPw() {
		return "find-new-pw";
	}
	
	@PostMapping("/findPw")
	public String findPw(@ModelAttribute FindPasswordForm form, RedirectAttributes redirectAttributes) {
		
		Member findMember = memberLoginService.findPw(form.getId(), form.getEmail());
		
		// 실패 로직
		if(findMember == null) {
			redirectAttributes.addAttribute("message", "맞지 않는 비밀번호 입니다.");
			return "redirect:/member/findPw";
		}
		
		String memberId = findMember.getId();
		
		return "redirect:/member/find-new-pw/{memberId}";
	}
	
	
}
