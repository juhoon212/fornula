package com.fornula.domain.item.dto.itemdetail;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpertMember {
	private Expert expert;
	private Member member;
}
