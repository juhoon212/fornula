package com.fornula.domain.expert.service;

import java.util.Map;

public interface ExpertRankingService {
	Map<String, Object> getExpertList(int pageNum);
	int getExpertCount();
	int getTotalMoney(int expertIdx);
}
