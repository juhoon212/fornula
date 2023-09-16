package com.fornula.domain.member.dto;

import java.util.List;

import com.fornula.domain.member.Auth;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

 //회원 관심사 테이블 삭제 후
  * 카테고리 1,2,3, 컬럼 추가
 *
 */

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	private int memberIdx;
	private String id;
	private String password;
	private String email;
	private String memberDate;
	private int memberStatus;
	private String memberFileName;
	private String loginDate;
	private int categoryOne; // 카테고리 1,2,3 추가
	private int categoryTwo;
	private int categoryThree;
	private String enabled;
	private List<Auth> memberAuthList;
}
