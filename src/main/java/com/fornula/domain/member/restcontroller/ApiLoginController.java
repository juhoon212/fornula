package com.fornula.domain.member.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.security.dto.OAuthToken;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class ApiLoginController {
	
	private final MemberSecurityService memberSecurityService;
	
	private final static String GRANT_TYPE = "authorization_code";
	private final static String CLIENT_ID = "5dddeec3f8b529b8f641c9f64fced9ae";
	private final static String REDIRECT_URI = "http://localhost:9003/member/kakao/login/callback";
	private final static String CLIENT_SECRET = "jqTkMb7rJz26JZnT25FR93rOy6s2dcHo";
	
	
	
	
	// data리턴해주는 컨트롤러 함수
		@GetMapping("/kakao/login/callback")
		public String kakaoCallback(String code, HttpSession session) {
			
			// post방식으로 요청시 key,value
			// RestTemplate
			
			
			RestTemplate rt = new RestTemplate();
			
			// HttpHeader 오브젝트 생성
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			
			// HttpBody 오브젝트 생성
			MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
			params.add("grant_type", GRANT_TYPE);
			params.add("client_id", CLIENT_ID);
			params.add("redirect_uri",REDIRECT_URI);
			params.add("code", code);
			params.add("client_secret", CLIENT_SECRET);
			
			
			
			
			//HttpHeader 와 HttpBody를 하나의 오브젝트에 담기
			HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest =
					new HttpEntity<>(params,headers);
			
			// Http요청하기 - post 방식으로 - 그리고 response 변수의 응답 받음.
			ResponseEntity<String> response = rt.exchange(
					"https://kauth.kakao.com/oauth/token",
					HttpMethod.POST,
					kakaoTokenRequest,
					String.class
					);
			
			// Gson, Json Simple
			ObjectMapper objectMapper = new ObjectMapper();
			
			OAuthToken oAuthToken = null;
			
			try {
				oAuthToken = objectMapper.readValue(response.getBody(), OAuthToken.class);
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
			log.info("카카오 엑세스 token = {}", oAuthToken.getAccess_token());
			
			
			
			RestTemplate rt2 = new RestTemplate();
			
			// HttpHeader 오브젝트 생성
			HttpHeaders headers2 = new HttpHeaders();
			headers2.add("Authorization", "Bearer "+ oAuthToken.getAccess_token());
			headers2.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			
			
			
			//HttpHeader 와 HttpBody를 하나의 오브젝트에 담기
			HttpEntity<MultiValueMap<String, String>> kakaoProfileRequest =
					new HttpEntity<>(headers2);
			
			// Http요청하기 - post 방식으로 - 그리고 response 변수의 응답 받음.
			ResponseEntity<String> response2 = rt2.exchange(
					"https://kapi.kakao.com/v2/user/me",
					HttpMethod.POST,
					kakaoProfileRequest,
					String.class
					);
			
			JSONParser parser = new JSONParser();
			// JSONParser.parse(String json) : JSON 형식의 문자열을 Object 객체로 변환하는 메소드
			Object object = null;
			try {
				object = parser.parse(response2.getBody());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Object 객체로 JSONObject 객체로 변환하여 저장
			JSONObject jsonObject = (JSONObject)object;
			JSONObject kakaoAccount = (JSONObject)jsonObject.get("kakao_account");
			String email = (String)kakaoAccount.get("email");
			JSONObject profile = (JSONObject)kakaoAccount.get("profile");
			String nickName = (String)profile.get("nickname");
			
			String garbagePassword = UUID.randomUUID().toString();
			
			Auth auth = new Auth();
			
			auth.setId("kakao_" + nickName);
			auth.setRole("ROLE_MEMBER");
			
			List<Auth> authList = new ArrayList<>();
			authList.add(auth);
			
			Member member = new Member();
			member.setId("kakao_" + nickName);
			member.setEmail(email);
			member.setPassword(garbagePassword);
			member.setEnabled("1");
			member.setMemberStatus(1);
			member.setCategoryOne(11);
			member.setCategoryTwo(11);
			member.setCategoryThree(11);
			member.setMemberAuthList(authList);
			
			log.info("loginMember아이디  = {}", member.getId());
			
			List<Member> findSecurityMemberById = memberSecurityService.findSecurityMemberById(member.getId());
			Member loginMember = findSecurityMemberById.stream().findAny().orElse(null);
			
			if(loginMember == null) {
				memberSecurityService.addAuth(auth);
				memberSecurityService.addSecurityMember(member);
			}
			
			CustomMemberDetails customMemberDetails = new CustomMemberDetails(member);
			
			Authentication authentication = new UsernamePasswordAuthenticationToken(customMemberDetails, null, customMemberDetails.getAuthorities());
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			session.setAttribute(SessionConst.Login_Member, customMemberDetails);
			
			log.info("loginMember = {}", customMemberDetails.getId());
			log.info("loginMember = {}", customMemberDetails.getMemberStatus());
			 
			return "redirect:/";
		}
}
