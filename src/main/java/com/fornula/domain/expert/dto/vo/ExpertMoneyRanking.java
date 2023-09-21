package com.fornula.domain.expert.dto.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ExpertMoneyRanking {
	private int expertIdx;
	private int salesIdx;
	private int itemIdx;
	private int price;
}