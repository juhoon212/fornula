package com.fornula.domain.expert.dto;

import com.fornula.domain.member.dto.Member;

import lombok.Data;

@Data
public class ExpertMember {
	private Member member;
	private Expert expert;
}
