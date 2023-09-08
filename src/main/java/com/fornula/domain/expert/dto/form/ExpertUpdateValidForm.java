package com.fornula.domain.expert.dto.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ExpertUpdateValidForm {
	private int expertIdx;
	private int memberIdx;
	
	@NotEmpty(message="")
	@Pattern(regexp="^\\d{3}-\\d{3,4}-\\d{4}$", message="전화번호를 반드시 형식에 맞게 입력해주세요.")
	private String phone;
	
	private int interest;
	@Max(500)
	private String introduce;
	
	private String career;
	
	
	private String companyOne;
	private String companyTwo;
	private String companyThree;
	private String expertfileName;
}