package com.fornula.domain.member.dto.mypage;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Password {
	private String password; // 현재패스워드
	private String newPassword; // 새로운 패스워드
	

}
