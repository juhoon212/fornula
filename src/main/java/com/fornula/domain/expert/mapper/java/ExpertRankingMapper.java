package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.vo.ExpertMoneyRanking;

public interface ExpertRankingMapper {
	List<ExpertMoneyRanking> selectExpertList(Map<String, Object> map);
	int selectExpertCount();
	List<ExpertMoneyRanking> selectTotalMoneyList(Map<String, Object> map);
//	int selectMoneyCount();
}