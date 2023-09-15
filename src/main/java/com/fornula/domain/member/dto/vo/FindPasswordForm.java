package com.fornula.domain.member.dto.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class FindPasswordForm {
	
	@NotNull(message = "아이디를 입력해주세요")
	private String id;
	@Email(message = "올바른 이메일을 입력해주세요")
	private String email;
}