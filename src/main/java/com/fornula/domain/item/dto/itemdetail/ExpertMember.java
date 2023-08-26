package com.fornula.domain.item.dto.itemdetail;

import org.springframework.stereotype.Component;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

import lombok.Data;

@Data
@Component
public class ExpertMember {
	private Expert expert;
	private Member member;
}
