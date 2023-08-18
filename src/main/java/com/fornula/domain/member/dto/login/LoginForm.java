package com.fornula.domain.member.dto.login;

import lombok.Getter;
import lombok.Setter;

/*
 * 로그인 폼 받기 
 */

@Getter
@Setter
public class LoginForm {
	
	private String id;
	private String password;
}
