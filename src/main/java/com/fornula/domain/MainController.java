package com.fornula.domain;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.extern.slf4j.Slf4j;

/*
 * 홈으로만 가는 컨트롤러 다른 것 작성 x
 */
@Slf4j
@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String home(HttpSession session, Model model) {
		
		 Member member = (Member) session.getAttribute(SessionConst.Login_Member); 
		 
			if (member == null) {
				model.addAttribute("headerPage", "header.jsp");
			} else if(member !=null) {
				int memberStatus = member.getMemberStatus();
				
				log.info("memberStatus: {}",memberStatus);
				
				if (memberStatus == 1 || memberStatus == 2) { 
					model.addAttribute("headerPage", "login-header.jsp"); 
				} else if(memberStatus ==9 ){ 
					return "admin-user";
				} else {
				model.addAttribute("headerPage", "header.jsp");
			
				}
				}
			
			return "main";
	}
}