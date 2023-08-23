package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
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
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MypagePasswordController {

	public final MypagePasswordService service;
	
	 @GetMapping("/mypagePwchange")
	   public String Pwchange() {
		   return "mypage-pwchange";
	   }
	   
	   @PostMapping("/mypagePwchange")
	   public String Pwchange(@ModelAttribute Password password, HttpSession session) throws MypageIdExcepion{
		   Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		   
		   log.info("sessionMember = {}", member); // 세션멤버조회
		  
		   Member loginMember = service.mypagePasswordId(member.getId());
		   
		
		   
		  //비번 복호화되있나?
		   
		   boolean isCheckedPw = BCrypt.checkpw(password.getPassword(), loginMember.getPassword());
		   
		   if(!isCheckedPw) {
			   return "mypage-pwchange";
		   }
		   
		   service.modifyPassword(loginMember.getId(), password.getNewPassword());
		   
		   return "mypage-purchase";
	   }
}
