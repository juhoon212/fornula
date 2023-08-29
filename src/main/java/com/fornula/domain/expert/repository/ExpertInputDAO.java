package com.fornula.domain.expert.repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Category;

public interface ExpertInputDAO {
    void updateExpert(Expert expert);
    Category selectOriginalCategory(int expertIdx);
}