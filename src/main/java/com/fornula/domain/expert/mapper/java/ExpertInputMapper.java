package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputMapper {
	int updateExpert(Expert expert);
	int expertBoard(Expert expert);
}
