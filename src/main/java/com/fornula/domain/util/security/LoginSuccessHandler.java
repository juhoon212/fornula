package com.fornula.domain.util.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberLoginService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSuccessHandler implements AuthenticationSuccessHandler{
	
	

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		List<String> roleNames = new ArrayList<>(); 
		
		for(GrantedAuthority authority : authentication.getAuthorities()) {
			roleNames.add(authority.getAuthority());
		}
		CustomMemberDetails customMemberDetails = (CustomMemberDetails) authentication.getPrincipal();
		
		log.info("로그인 사용자 = {}", customMemberDetails.getId());

		HttpSession session = request.getSession();
		session.setAttribute(SessionConst.Login_Member, customMemberDetails);
		
		log.warn(roleNames.toString());
		
		if(roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect(request.getContextPath() + "/");
			return;
		}
		
		response.sendRedirect(request.getContextPath() + "/");
	}

}
