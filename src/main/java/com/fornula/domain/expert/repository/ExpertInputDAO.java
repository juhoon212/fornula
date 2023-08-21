package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputDAO {
	int updateExpert(Expert expert);
	int expertBoard(Expert expert);
}
