package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Category;

public interface ExpertInputMapper {
	void updateExpert(Expert expert);
    Category selectOriginalCategory(int expertIdx);
}
