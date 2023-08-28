package com.fornula.domain.expert.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

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
@Component
public class Expert {
	private int expertIdx;
	private int memberIdx;
	private String phone;
	private int interest;
	private String introduce;
	private String career;
	private String companyOne;
	private String companyTwo;
	private String companyThree;
	private String expertfileName;
}
