package com.fornula.domain.member.dto.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

// 회원가입 폼
public class JoinMemberForm {
	
	private int memberIdx;
	
	@NotEmpty(message = "아이디를 입력해 주세요")
	@Pattern(regexp = "^[a-zA-Z0-9]{6,20}$", message = "6~20자의 영문 소문자와 숫자만 사용 가능합니다")
	private String id;
	
	@NotEmpty(message = "비밀번호를 입력해 주세요")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$"
			, message = "8~20자의 영문, 숫자, 특수문자를 모두 포함한 비밀번호를 입력해주세요")
	private String password;
	
	@NotEmpty(message = "이메일을 입력해 주세요")
	@Email(message = "이메일을 양식으로 작성해 주세요")
	private String email;
	private String memberDate;
	private int memberStatus;
	private String memberFileName;
	private String loginDate;
	private String categoryOne; 
	private String categoryTwo;
	private String categoryThree;
}
