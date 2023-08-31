package com.fornula.domain.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//전문가 인터셉터
public class ExpertAuthIntercepto implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler
			)
			throws Exception {

		HttpSession session = request.getSession(false);
		Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
		String requestURI = request.getRequestURI();
		log.info("requestURI= {}",requestURI);
		
		
		if (session == null ||loginMember == null || loginMember.getMemberStatus() != 2) {
			log.info("loginMember{}",loginMember);

			response.sendError(HttpServletResponse.SC_FORBIDDEN);

			return false;

		}
		
		return true;
	}
}
