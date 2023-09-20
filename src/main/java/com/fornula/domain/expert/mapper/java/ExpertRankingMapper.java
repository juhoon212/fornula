package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.TotalSalesMoney;

public interface ExpertRankingMapper {
//	전문가 랭킹이 아니라! 전문가 랭킹을 위한 전문가 리스트 출력 처리
	List<Expert> selectExpertList(Map<String, Object> map);
	int selectExpertCount();
	List<TotalSalesMoney> selectTotalMoney(int expertIdx);
}
