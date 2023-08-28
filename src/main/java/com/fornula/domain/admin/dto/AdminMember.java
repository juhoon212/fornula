package com.fornula.domain.admin.dto;

import java.util.Date;

import lombok.Data;

// member 출력리스트
// idx, id, 회원 상태 가입 일자, 
@Data
public class AdminMember {
	private int memberIdx;
	private String id;
	private Date memberDate;
	private int memberStatus;
}
