package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertOutputDAO {
	Expert selectExpert(int expert_idx);
}
