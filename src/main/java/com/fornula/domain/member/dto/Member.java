package com.fornula.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 이름              널?       유형            
--------------- -------- ------------- 
MEMBER_IDX      NOT NULL NUMBER        
ID              NOT NULL VARCHAR2(20)  
PASSWORD        NOT NULL VARCHAR2(100) 
EMAIL           NOT NULL VARCHAR2(40)  
MEMBER_DATE     NOT NULL DATE          
MEMBER_STATUS   NOT NULL NUMBER        
MEMBERFILE_NAME          VARCHAR2(100) 
LOGIN_DATE               DATE          
 *
 */

@Data
public class Member {
	
	private int memberIdx;
	private String id;
	private String password;
	private String email;
	private String memberDate;
	private int memberStatus;
	private String memberFileName;
	private String loginDate;
}
