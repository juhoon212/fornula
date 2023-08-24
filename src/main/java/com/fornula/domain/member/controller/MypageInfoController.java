package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.mapper.java.MypageInfoMapper;
import com.fornula.domain.member.service.MypageInfoService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class MypageInfoController {
	
	public final MypageInfoService service;
  
	@GetMapping("/mypageInfo")
	public String info() {
	return "mypage-info";
	}
	
	@PostMapping("/mypageInfo")
	public String info(@ModelAttribute InfoCategory category, HttpSession session) {
	
		Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		
	    Member joinMember = service.mypageInfoService(member.getId());
		   
	    session.setAttribute("member", joinMember);
	    //카테고리 값이 null일때 에러처리를 어떻게 한담..
		   //if(category.getOne()==null) {
			//   return "mypage-info";
		   //}
	   
		   service.modifyPassword(category.getOne(), category.getTwo(), category.getThree(), member.getId());
		   
		   return "mypage-info"; 
	}
}
