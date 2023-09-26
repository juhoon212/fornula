package com.fornula.domain.util.security;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;

@Component
//구글 로그인을 위한 빈 등록
public class GoogleLoginBean {
	private static final String GOOGLE_CLIENT_ID = "746123676134-el542ag1abucm152bt5n6s2l3q9s0reh.apps.googleusercontent.com";
	private static final String GOOGLE_CLIENT_SECRET = "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";
	private static final String GOOGLE_REDIRECT_URI = "https://www.itwill.xyz/fornula/google/callback";
	//private static final String GOOGLE_REDIRECT_URI = "http://localhost:9003/google/callback";
	private static final String GOOGLE_SESSION_STATE = "googleState";
	// 토큰으로 가져올 값의 범위 - 이메일,id,email 가져옴
	private final static String GOOGLE_SCOPE = "email openid profile";
	// 프로필 조회 API URL
	private final static String GOOGLE_PROFILE_API_URL = "https://www.googleapis.com/oauth2/v2/userinfo";

	// 구글 인증 url 생성 메소드
	public String getAuthorizationUrl(HttpSession session) {

		// 세션 유효성 검증을 위한 난수 생성
		String state = generateRandomString();
		// 난수 세션에 저장
		setSession(session, state);

		// scribe에서 제공하는 인증 url 생성 기능을 이용하여 구글 인증 url 생성
		OAuth20Service oauthService = new ServiceBuilder()
				.apiKey(GOOGLE_CLIENT_ID)
				.apiSecret(GOOGLE_CLIENT_SECRET)
				.callback(GOOGLE_REDIRECT_URI)
				.state(state)// 난수값 저장
				.scope(GOOGLE_SCOPE).build(GoogleLoginApi.instance());

		// 인증 url 가져옴
		String authoriztionUrl = oauthService.getAuthorizationUrl();

		return authoriztionUrl;

	}

	// 구글 callback 처리 및 AccessToken 획득 메소드
	public OAuth2AccessToken getAccessToken(HttpSession session, String code, String state) throws IOException {

		// 콜백함수로 전달받은 세션검증용 난수값과 세션에 저장되어 있는 값이 일치하는지 확인
		String sessionState = getSession(session);

		if (StringUtils.pathEquals(sessionState, state)) {
			// 사용자가 접근 토큰을 받기위해 저장된 oauth21service 객체 생성
			OAuth20Service oAuth20Service = new ServiceBuilder()
					.apiKey(GOOGLE_CLIENT_ID)
					.apiSecret(GOOGLE_CLIENT_SECRET)
					.callback(GOOGLE_REDIRECT_URI).state(state)
					.scope(GOOGLE_SCOPE)
					.build(GoogleLoginApi.instance());

			OAuth2AccessToken accessToken = oAuth20Service.getAccessToken(code);
			return accessToken;
		}

		return null;

	}

	/* 세션 유효성 검증을 위한 난수 생성기 */
	private String generateRandomString() {
		return UUID.randomUUID().toString();
	}

	/* http session에 데이터 저장 */
	private void setSession(HttpSession session, String state) {
		session.setAttribute(GOOGLE_SESSION_STATE, state);
	}

	/* http session에서 데이터 가져오기 */
	private String getSession(HttpSession session) {
		return (String) session.getAttribute(GOOGLE_SESSION_STATE);
	}

	/* Access Token을 이용하여 네이버 사용자 프로필 API를 호출 */
	public String getUserProfile(OAuth2AccessToken oauthToken) throws IOException {

		OAuth20Service oauthService = new ServiceBuilder()
				.apiKey(GOOGLE_CLIENT_ID)
				.apiSecret(GOOGLE_CLIENT_SECRET)
				.callback(GOOGLE_REDIRECT_URI)
				.build(GoogleLoginApi.instance());

		//사용자의 프로필을 제공하는 API를 요청하기 위한 객체 생성
		OAuthRequest request = new OAuthRequest(Verb.GET, GOOGLE_PROFILE_API_URL, oauthService);
		//사용자 접속 토큰과 API 요청 객체를 전달하여 로그인 사용의 프로필 요청
		oauthService.signRequest(oauthToken, request);
		//요청에 대한 결과(사용자 프로필)를 응답받아 저장
		Response response = request.send();

		// 응답 데이터 확인
		String responseBody = response.getBody();
		System.out.println("Google API Response: " + responseBody);
		
		//결과(JSON) 반환
		return response.getBody();
	}

}
