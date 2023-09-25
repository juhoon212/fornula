package com.fornula.domain.util.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.exception.custom.NotFoundIdException;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.util.session.SessionConst;
import com.github.scribejava.core.model.OAuth2AccessToken;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/google")
@RequiredArgsConstructor
public class GoogleLoginController {
	private final GoogleLoginBean googleLoginBean;
	private final MemberSecurityService memberSecurityService;

	// 구글 로그인 페이지 요청하기 위한 요청 처리 메소드
	@RequestMapping("/login")
	public String login(HttpSession session) throws UnsupportedEncodingException {
		String googleAuthUrl = googleLoginBean.getAuthorizationUrl(session);
		return "redirect:" + googleAuthUrl;

	}

	// 구글 로그인 성공시 Callback URL 페이지를 처리하기 위한 요청 처리 메소드
	@RequestMapping("/callback")
	public String login(@RequestParam String code, @RequestParam String state, HttpSession session, Model model)
			throws IOException, ParseException {
		OAuth2AccessToken accessToken = googleLoginBean.getAccessToken(session, code, state);

		// 사용자 접근 토근을 이용해 로그인 사용자의 프로필 반환 메소드 호출해 사용자 프로필을 apiResult에 저장
		String apiResult = googleLoginBean.getUserProfile(accessToken);
		log.info("apiResult:{}", apiResult);

		// jsonparser객체를 이용해 문자열을 json 객체로 변환
		JSONParser parser = new JSONParser();
		Object object = parser.parse(apiResult);
		JSONObject responseObject = (JSONObject) object;

		String id = (String) responseObject.get("id");
		String email = (String) responseObject.get("email");

		log.info("id:{}", id);
		System.out.println("aaaaa");

		// 반환받은 구글 사용자 프로필의 값을 사용하여 Java 객체의 필드값으로 저장
		Auth auth = new Auth();
		auth.setId("google_" + id);
		auth.setRole("ROLE_MEMBER");
		log.info("auth{}:", auth);

		// authList에 위에서 저장한 auth 객체를 추가
		List<Auth> authList = new ArrayList<Auth>();
		authList.add(auth);

		Member member = new Member();
		member.setId("google_" + id);
		member.setPassword(UUID.randomUUID().toString());
		member.setEmail(email);
		member.setEnabled("1");
		member.setMemberStatus(1);
		member.setCategoryOne(1);
		member.setCategoryTwo(1);
		member.setCategoryThree(1);
		
		member.setMemberAuthList(authList);

		log.info("member{}:", member);

		// 아이디로 찾은 list에서 해당 id 객체 찾아서 비교
		List<Member> findSecurityMemberById = memberSecurityService.findSecurityMemberById(member.getId());
		Member loginMember = findSecurityMemberById.stream().findAny().orElse(null);
		
		if(loginMember == null) {
			memberSecurityService.addAuth(auth);
			memberSecurityService.addSecurityMember(member);
		}
		
		// 구글 로그인 사용자 정보를 사용하여 UserDetails 객체(로그인 사용자)를 생성하여 저장
		CustomMemberDetails customMemberDetails = new CustomMemberDetails(loginMember);
		
		Authentication authentication = new UsernamePasswordAuthenticationToken(customMemberDetails, null, customMemberDetails.getAuthorities());
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		session.setAttribute(SessionConst.Login_Member, customMemberDetails);
		
		log.info("loginMember = {}", customMemberDetails.getMemberStatus());
		 
		return "redirect:/";
	}
}
