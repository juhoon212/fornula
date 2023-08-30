package com.fornula.domain.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.Secession;
import com.fornula.domain.member.service.MypageSecessionService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class MypageSecessionController {
	
	private final MypageSecessionService service;
	
   @GetMapping("/mypageSession")
   public String Session(HttpSession session) {
	   Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		  
	   session.setAttribute("member", member);
	   return "mypage-secession";
   }
   
   @PostMapping("/mypageSession")                                                  //Custom 예외 처리
   public String Session(@ModelAttribute Secession secession, HttpSession session,Model model) throws MypageIdExcepion{
	   Member joinMember = service.mypageSecession(secession.getId());
	   
	   Member member = (Member)session.getAttribute(SessionConst.Login_Member);
	   
	   if( member.getId()!=joinMember.getId()) {
		   return "mypage-secession";
	   }
	   //회원 탈퇴 세션없앰
	   session.invalidate();
	   
	   model.addAttribute("message", "그동안 이용해주셔서 감사합니다.");
	   
	   return "common-success";
   }
}
