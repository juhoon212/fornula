package com.fornula.domain.util.security;

import com.github.scribejava.core.builder.api.DefaultApi20;

//로그인 관련 api 정보 제공하는 클래스
public class GoogleLoginApi extends DefaultApi20 {
	//싱글톤 사용
	public GoogleLoginApi() {
		// TODO Auto-generated constructor stub
	}
	private static class InstanceHolder{
		private static final GoogleLoginApi INSTANCE = new GoogleLoginApi();
	}
	public static GoogleLoginApi instance() {
		return InstanceHolder.INSTANCE;
	}
	
	//사용자 접근 토근 제공을 위한 api의 url 주소 반환하는 메소드
	@Override
	public String getAccessTokenEndpoint() {
		return "https://accounts.google.com/o/oauth2/token";
	}
	
	//로그인 처리를 위한 API의 URL 주소를 반환하는 메소드
	@Override
	protected String getAuthorizationBaseUrl() {
		return "https://accounts.google.com/o/oauth2/v2/auth";
	}

}
