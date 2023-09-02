package com.fornula.domain.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.fornula.domain.exception.custom.LoginUserCheckException;
import com.fornula.domain.util.session.SessionConst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestURI = request.getRequestURI();
		
		log.info("REQUEST URI = {}", requestURI);
		
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute(SessionConst.Login_Member) == null) {
						
			
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}
		
		return true;
	}
	
	

}