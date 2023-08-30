package com.fornula.domain.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//������ ���ͼ���
public class AdminAuthInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler
			)
			throws Exception {

		HttpSession session = request.getSession(false);
		Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
		String requestURI = request.getRequestURI();
		log.info("requestURI= {}",requestURI);

		if (loginMember == null || loginMember.getMemberStatus() != 9) {
			log.info("admin interceptor");

			response.sendRedirect("/");

			return false;

		}

		return true;
	}
}
