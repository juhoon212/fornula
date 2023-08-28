package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputMapper {
	int updateExpert(Expert expert);
//	List<Item> selectExpertItemList(Map<String, Object> map);
	int insertExpertInfo(Expert expert);
//	int selectExpertBoardCount();
}
