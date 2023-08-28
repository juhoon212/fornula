package com.fornula.domain.member.dto.join;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

// 회원가입 폼
public class JoinMemberForm {
	
	private int memberIdx;
	private String id;
	private String password;
	private String email;
	private String memberDate;
	private int memberStatus;
	private String memberFileName;
	private String loginDate;
	private String categoryOne; 
	private String categoryTwo;
	private String categoryThree;
}
