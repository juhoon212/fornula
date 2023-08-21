package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;

public interface ExpertInputMapper {
	int updateExpert(Expert expert);
	int selectExpertBoardCount();
	List<ExpertItemPhoto> selectExpertBoardList(Map<String, Object> map);
}
