package com.fornula.domain.member.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindPasswordForm {
	
	private String id;
	private String email;
}
