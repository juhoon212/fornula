package com.fornula.domain.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.exception.custom.MypageIdExcepion;
import com.fornula.domain.item.dto.Category;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.member.mapper.java.MypageInfoMapper;
import com.fornula.domain.member.service.MemberLoginService;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.member.service.MypageInfoService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageInfoController {
	
	private final MypageInfoService service;
	private final MemberSecurityService memberSecurityService;
	
	
	@GetMapping("/mypageInfo")
	public String info(HttpSession session, Model model) {
	
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		
		Member member = memberSecurityService.getSecurityMember(loginMember.getId());
		
	    Member joinMember = service.mypageInfoService(member.getId());
	    Category categoryOne=service.mypageCategoryOne(member.getCategoryOne());
	    Category categoryTwo=service.mypageCategoryTwo(member.getCategoryTwo());
	    Category categoryThree=service.mypageCategoryThree(member.getCategoryThree());
	    
	    log.info("getmodelJoinMember = {}", joinMember);
	    
	    model.addAttribute("member", joinMember);
	    model.addAttribute("categoryOne", categoryOne);
	    model.addAttribute("categoryTwo", categoryTwo);
	    model.addAttribute("categoryThree", categoryThree);
		   
		return "mypage-info"; 
		  
	}
	
	//@PostMapping("/mypageInfo")
	//public String info(@ModelAttribute InfoCategory category, HttpSession session, Model model) {
	
     //   Member member = (Member)session.getAttribute(SessionConst.Login_Member);
      //  log.info("sessionMember = {}", member);
        
	 //   Member joinMember = service.mypageInfoService(member.getId());
	 //   log.info("modelJoinMember = {}", joinMember);
	    
	 //   model.addAttribute("member", joinMember);
		  
		   //if(category.getOne()==null) {
			//   return "mypage-info";
		   //}
	   
	//	 service.modifyPassword(category.getOne(), category.getTwo(), category.getThree(), member.getId());
		   
	//	 return "mypage-infoChange"; 
//	}
	
	@GetMapping("/mypageInfoChange")
	public String infoChange(HttpSession session, Model model) {
	
		CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		log.info("getsessionMember = {}", member);
		
	    Member joinMember = service.mypageInfoService(member.getId());
	    Category categoryOne=service.mypageCategoryOne(member.getCategoryOne());
	    Category categoryTwo=service.mypageCategoryTwo(member.getCategoryTwo());
	    Category categoryThree=service.mypageCategoryThree(member.getCategoryThree());
	    
	    log.info("infoChange = { ", joinMember);
	    
	    model.addAttribute("member", joinMember);
	    model.addAttribute("categoryOne", categoryOne);
	    model.addAttribute("categoryTwo", categoryTwo);
	    model.addAttribute("categoryThree", categoryThree);
	    
		   
		return "mypage-infoChange"; 
		  
	}
	
	@PostMapping("/mypageInfoChange")
	public String infoChange(@ModelAttribute Member email, HttpSession session, Model model) {
	
		CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		
		if(email.getEmail()==null) {
			return "mypage-infoChange"; 
		}
		service.modifyEmail(member.getId(),email.getEmail());
		
	    Member joinMember = service.mypageInfoService(member.getId());
	    Category categoryOne=service.mypageCategoryOne(member.getCategoryOne());
	    Category categoryTwo=service.mypageCategoryTwo(member.getCategoryTwo());
	    Category categoryThree=service.mypageCategoryThree(member.getCategoryThree());
	    
	    log.info("mypageInfoChange = {} ", joinMember);
	    
	    model.addAttribute("member", joinMember);
	    model.addAttribute("categoryOne", categoryOne);
	    model.addAttribute("categoryTwo", categoryTwo);
	    model.addAttribute("categoryThree", categoryThree);
		   
		return "mypage-info"; 
		  
	}
	
}
