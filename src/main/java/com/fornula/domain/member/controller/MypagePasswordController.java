package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.exception.custom.MypagePwException;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.Password;
import com.fornula.domain.member.dto.mypage.Secession;
import com.fornula.domain.member.service.MypagePasswordService;
import com.fornula.domain.member.service.MypageSecessionService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MypagePasswordController {

	public final MypagePasswordService service;
	
	 @GetMapping("/mypagePwchange")
	   public String Pwchange(HttpSession session) {
		 
		 CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		 
		 session.setAttribute("member", member);
		 
		   return "mypage-pwchange";
	   }
	   
	   @PostMapping("/mypagePwchange")
	   public String Pwchange(@ModelAttribute Password password, HttpSession session,Model model) throws MypagePwException{
		   CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		   
		   log.info("sessionMember = {}", member); // 세션멤버조회
		  
		   Member loginMember = service.mypagePasswordId(member.getId());
		   
		   
		  //비번 복호화
		   
		   boolean isCheckedPw = BCrypt.checkpw(password.getPassword(), loginMember.getPassword());
		   
		   if(!isCheckedPw) {
			   throw new MypagePwException("올바른 비밀번호를 입력해주세요.");
		   }
		   
		   //비번 암호화
		   String hashPassword=BCrypt.hashpw( password.getNewPassword(), BCrypt.gensalt());
		  
		   
		   service.modifyPassword(loginMember.getId(), hashPassword);
		   
		   model.addAttribute("message", "비밀번호가 변경되었습니다.");
		   
		   return "common-success";
	   }
}
