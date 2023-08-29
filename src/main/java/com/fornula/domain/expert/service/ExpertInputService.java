package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;

public interface ExpertInputService {
    void modifyExpert(Expert expert);
    Expert getOriginalExpert(int expertIdx);
}