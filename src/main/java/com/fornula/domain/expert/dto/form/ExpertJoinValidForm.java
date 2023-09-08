package com.fornula.domain.expert.dto.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import com.fornula.domain.item.dto.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*�̸�              ��?       ����            
--------------- -------- ------------- 
EXPERT_IDX      NOT NULL NUMBER        
MEMBER_IDX      NOT NULL NUMBER        
PHONE           NOT NULL VARCHAR2(50)  
INTEREST        NOT NULL NUMBER(20)    
INTRODUCE                VARCHAR2(500) 
CAREER                   VARCHAR2(20)  
COMPANY_ONE              VARCHAR2(20)  
COMPANY_TWO              VARCHAR2(20)  
COMPANY_THREE            VARCHAR2(20)  
EXPERTFILE_NAME          VARCHAR2(100)  */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpertJoinValidForm {
	private int expertIdx;
	private int memberIdx;
	
	@NotEmpty(message="")
	@Pattern(regexp="^\\d{3}-\\d{3,4}-\\d{4}$", message="전화번호를 반드시 형식에 맞게 입력해주세요.")
	private String phone;
	
	private int interest;
	private String introduce;
	private String career;
	private String companyOne;
	private String companyTwo;
	private String companyThree;
	private String expertfileName;
}
