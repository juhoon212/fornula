package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.vo.ExpertMoneyRanking;

public interface ExpertRankingDAO {
	List<ExpertMoneyRanking> selectExpertList(Map<String, Object> map);
	int selectExpertCount();
	List<ExpertMoneyRanking> selectTotalMoneyList(Map<String, Object> map);
//	int selectMoneyCount();
}