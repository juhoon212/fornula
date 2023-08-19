package com.fornula.domain.member.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;


/*
 * 로그인 폼 받기 
 */

@Data
@AllArgsConstructor
public class LoginForm {
	
	private String id;
	private String password;
}
