package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputDAO {
	int updateExpert(Expert expert);
//	List<Item> selectExpertItemList(Map<String, Object> map);
	int insertExpertInfo(Expert expert);
//	int selectExpertBoardCount();
}