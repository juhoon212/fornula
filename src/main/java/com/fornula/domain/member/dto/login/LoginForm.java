package com.fornula.domain.member.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * 로그인 폼 받기 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginForm {
	
	private String id;
	private String password;
}