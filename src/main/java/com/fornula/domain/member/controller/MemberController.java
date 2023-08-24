package com.fornula.domain.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/findPw")
	public String findPw(@ModelAttribute FindPasswordForm form, RedirectAttributes redirectAttributes) {
		
		Member findMember = memberLoginService.findPw(form.getId(), form.getEmail());
		
		// 실패 로직
		if(findMember == null) {
			redirectAttributes.addAttribute("status", "false");
			redirectAttributes.addFlashAttribute("message", "맞지 않는 아이디 또는 이메일입니다.");
			return "redirect:/member/findPw";
		}
		
		int memberIdx = findMember.getMemberIdx();
		
		return "/member/updatePassword/{memberIdx}";
	}
	
	@GetMapping("/updatePassword/{memberIdx}")
	public String findNewPw(@PathVariable String memberIdx, Model model) {
		
		model.addAttribute("memberIdx", memberIdx);
		
		return "update-password";
	}
	
	@PostMapping("/updatePassword/{memberIdx}") 
	public String updatePassword(@PathVariable String memberIdx, @RequestParam(required = false) String newPassword, RedirectAttributes redirectAttributes) {
		Member findByIdxMember = memberLoginService.findByIdx(Integer.parseInt(memberIdx));
		
		if(findByIdxMember == null) {
			redirectAttributes.addFlashAttribute("message", "찾으시는 비밀번호와 동일한 아이디가 없습니다");
			return "redirect:/member/findPw";
		}
		
		int result = memberLoginService.updatePassword(findByIdxMember.getId(), newPassword);
		
		if(result == 0) {
			return "404";
		}
		
		
		return "redirect:/";
	}
	
	
	
	
	
}