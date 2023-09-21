package com.fornula.domain.expert.service;

import java.util.Map;

public interface ExpertRankingService {
	Map<String, Object> getExpertList(int pageNum);
	int getExpertCount();
	Map<String, Object> getMoneyList(int pageNum);
}
	