package com.fornula.domain.board.dto;

import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	
	private Review review;
	private Purchase purchase;
	private Member member;
}
