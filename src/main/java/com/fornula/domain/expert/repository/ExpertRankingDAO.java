package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.vo.ExpertMoneyRanking;

public interface ExpertRankingDAO {
	List<Expert> selectExpertList(Map<String, Object> map);
	int selectExpertCount();
	List<ExpertMoneyRanking> selectTotalMoneyList(Map<String, Object> map);
	int selectMoneyCount();
}
