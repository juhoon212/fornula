package com.fornula.domain.member.dto.vo;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
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
public class IdFindForm {
	
	@Email(message = "올바른 이메일을 입력해주세요")
	private String email;
}