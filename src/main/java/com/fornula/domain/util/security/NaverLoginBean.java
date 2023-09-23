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
public class NaverLoginBean {
	private static final String CLIENT_ID="LEQOvYLdqGNaKx_u2O4G";
	private static final String CLIENT_SAECRET="ACzGOvrIyN";
	private static final String REDIRECT_URI="http://localhost:8000/naver/callback";
	private static final String SESSION_STATE="naverState";
	private static final String PROFILE_API_URI="https://openapi.naver.com/v1/nid/me";
	
	public String getAuthorizationUrl(HttpSession session) {
		String state=UUID.randomUUID().toString();
		 
		session.setAttribute(SESSION_STATE, state);
		
		OAuth20Service oAuth20Service=new ServiceBuilder()
				.apiKey(CLIENT_ID)
				.callback(REDIRECT_URI)
				.state(state)
				.build(NaverLoginApi.instance());
		
		return oAuth20Service.getAuthorizationUrl();
	}
	
	public OAuth2AccessToken getAccessToken(HttpSession session, String code, String state) throws IOException {
		String sessionState=(String)session.getAttribute(SESSION_STATE);
		
		if(!StringUtils.pathEquals(sessionState, state)) {
			return null;
		}
		
		OAuth20Service oAuth20Service=new ServiceBuilder()
				.apiKey(CLIENT_ID)
				.apiSecret(CLIENT_SAECRET)
				.callback(REDIRECT_URI)
				.state(state)
				.build(NaverLoginApi.instance());
		
		OAuth2AccessToken accessToken=oAuth20Service.getAccessToken(code);
		
		return accessToken;
	}
	
	public String getUserProfile(OAuth2AccessToken accessToken) throws IOException {
		OAuth20Service oAuth20Service=new ServiceBuilder()
				.apiKey(CLIENT_ID)
				.apiSecret(CLIENT_SAECRET)
				.callback(REDIRECT_URI)
				.build(NaverLoginApi.instance());
		
		OAuthRequest request=new OAuthRequest(Verb.GET, PROFILE_API_URI, oAuth20Service);
		
		oAuth20Service.signRequest(accessToken, request);
		
		Response response=request.send();
		
		return response.getBody();
	}
}
