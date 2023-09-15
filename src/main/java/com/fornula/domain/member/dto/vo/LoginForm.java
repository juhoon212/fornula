package com.fornula.domain.member.dto.vo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
 * 로그인 폼 받기 
 */

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LoginForm {
	
	@NotEmpty
	private String id;
	@NotEmpty
	private String password;
}