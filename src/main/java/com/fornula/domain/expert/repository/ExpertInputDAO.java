package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputDAO {
    void updateExpert(Expert expert);
    Expert selectOriginalExpert(int expertIdx);
}