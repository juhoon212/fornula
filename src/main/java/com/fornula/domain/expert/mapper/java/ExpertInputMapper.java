package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputMapper {
    void updateExpert(Expert expert);
    Expert originalExpert(int expertIdx);
}