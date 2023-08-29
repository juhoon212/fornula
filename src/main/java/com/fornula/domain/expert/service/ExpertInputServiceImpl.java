package com.fornula.domain.expert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.item.dto.Category;

@Service
public class ExpertInputServiceImpl implements ExpertInputService {
    private final ExpertInputDAO expertInputDAO;

    @Autowired
    public ExpertInputServiceImpl(ExpertInputDAO expertInputDAO) {
        this.expertInputDAO = expertInputDAO;
    }

    @Override
    public void modifyExpert(Expert expert) {
        // 전문가 정보 수정에 관련된 로직 구현
        expertInputDAO.updateExpert(expert);
    }

    @Override
    public Category getExpertOriginalCategory(int expertIdx) {
        // 전문가의 원래 카테고리를 가져오는 로직 구현
        return expertInputDAO.selectOriginalCategory(expertIdx);
    }
}