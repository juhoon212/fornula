package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;

public interface ExpertInputDAO {
	int updateExpert(Expert expert);
	int selectExpertBoardCount();
	List<ExpertItemPhoto> selectexpertBoardList(Map<String, Object> map);
}
