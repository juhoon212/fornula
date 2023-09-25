package com.fornula.domain.member.restcontroller;

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
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.util.security.NaverLoginBean;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;
import com.github.scribejava.core.model.OAuth2AccessToken;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/naver")
@RequiredArgsConstructor
@Slf4j
public class NaverLoginController {
	private final NaverLoginBean naverLoginBean;
	private final MemberSecurityService memberSecurityService;
	
	@RequestMapping("/login")
	public String login(HttpSession session) throws UnsupportedEncodingException {
		String naverAuthUrl=naverLoginBean.getAuthorizationUrl(session);
		return "redirect:"+naverAuthUrl;
	}
	
	@RequestMapping("/callback")
	public String login(@RequestParam String code, @RequestParam String state
			,Model model,HttpSession session) throws IOException, ParseException {
		OAuth2AccessToken accessToken=naverLoginBean.getAccessToken(session, code, state);
		
		String apiResult=naverLoginBean.getUserProfile(accessToken);
		
		JSONParser parser=new JSONParser();
		Object object=parser.parse(apiResult);
		JSONObject jsonObject=(JSONObject)object;
		
		JSONObject responseObject=(JSONObject)jsonObject.get("response");
		String id=(String)responseObject.get("id");
		String email=(String)responseObject.get("email");
		
		Auth auth=new Auth();
		auth.setId("naver_"+id);
		auth.setRole("ROLE_MEMBER");
		
		List<Auth> authList=new ArrayList<Auth>();
		authList.add(auth);
		
		Member member = new Member();
		member.setId("naver_"+id);
		member.setPassword(UUID.randomUUID().toString());
		member.setEmail(email);
		member.setEnabled("1");
		member.setMemberStatus(1);
		member.setCategoryOne(1);
		member.setCategoryTwo(2);
		member.setCategoryThree(3);
		member.setMemberAuthList(authList);
		
		if(memberSecurityService.getSecurityMember("naver_"+id) == null) {
			memberSecurityService.addSecurityMember(member);
			memberSecurityService.addAuth(auth);
		}
		
		CustomMemberDetails customMemberDetails=new CustomMemberDetails(member);
		
		Authentication authentication=new UsernamePasswordAuthenticationToken
				(customMemberDetails, null, customMemberDetails.getAuthorities());
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		session.setAttribute(SessionConst.Login_Member, customMemberDetails);
		CustomMemberDetails loginMember = (CustomMemberDetails)session.getAttribute(SessionConst.Login_Member);
		model.addAttribute("loginMember",loginMember);
		
		return "redirect:/";
	}
}
