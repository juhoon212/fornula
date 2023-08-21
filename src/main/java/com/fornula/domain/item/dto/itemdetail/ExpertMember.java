package com.fornula.domain.item.dto.itemdetail;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

import lombok.Data;

@Data
public class ExpertMember {
	private Expert expert;
	private Member member;
}
