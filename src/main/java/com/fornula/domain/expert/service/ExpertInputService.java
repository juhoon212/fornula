package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Category;

public interface ExpertInputService {
    void modifyExpert(Expert expert);
    Category getExpertOriginalCategory(int expertIdx);
}