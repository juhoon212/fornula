package com.fornula.domain.member.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.join.JoinMemberForm;
import com.fornula.domain.member.dto.login.FindPasswordForm;
import com.fornula.domain.member.service.MemberJoinService;
import com.fornula.domain.member.service.MemberLoginService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	
	private final MemberLoginService memberLoginService;
	private final MemberJoinService memberJoinService;
	
	
	
	
	// 회원가입 폼
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	// 회원가입 
	@PostMapping("/join")
	public String joinForm(@ModelAttribute JoinMemberForm form, RedirectAttributes redirectAttributes) {
		
		log.info("category1 = {}, category2 = {}, category3={}", form.getCategoryOne(), form.getCategoryTwo(), form.getCategoryThree());

		 List<String> categoryList = new ArrayList<>();
		 
		 categoryList.add(form.getCategoryOne());
		 categoryList.add(form.getCategoryTwo());
		 categoryList.add(form.getCategoryThree()); // form 데이터 list에 담는다
		 
		 List<Integer> resultCategory = memberJoinService.selectCategory(categoryList); // 입력받은 카테고리(ex : 디자인)를 category 테이블에서 조회 후 반환값 -> resultCategory
		 
		 Member member = new Member();
		 
		 member.setId(form.getId());
		 member.setPassword(form.getPassword());
		 member.setEmail(form.getEmail());
		 member.setCategoryOne(resultCategory.get(0));
		 member.setCategoryTwo(resultCategory.get(1));
		 member.setCategoryThree(resultCategory.get(2)); // 멤버에 categoryIdx 값 가져와서 넣기
		 
		 int result = memberJoinService.joinMember(member);
		 
		 if(result == 0) {
			 redirectAttributes.addFlashAttribute("message", "회원가입이 실패하였습니다");
			 return "redirect:/member/join";
		 }
		 return "redirect:/";
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