package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.Password;
import com.fornula.domain.member.dto.mypage.Secession;
import com.fornula.domain.member.service.MypagePasswordService;
import com.fornula.domain.member.service.MypageSecessionService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MypagePasswordController {

	public final MypagePasswordService service;
	
	 @GetMapping("/mypagePwchange")
	   public String Pwchange() {
		   return "mypage-pwchange";
	   }
	   
	   @PostMapping("/mypagePwchange")
	   public String Pwchange(@ModelAttribute Password password, HttpSession session) throws MypageIdExcepion{
		   Member joinMember = service.MypagePassword(password.getPassword());
		   
		   Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		   
		   
		   if( member.getId()!=joinMember.getId()) {
			   return "mypage-pwchange";
		   }
		   
		   session.invalidate();
		   
		   
		   return "mypage-purchase";
	   }
}
