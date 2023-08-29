package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertInputServiceImpl implements ExpertInputService {

    private final ExpertInputDAO expertInputDAO;

    @Autowired
    public ExpertInputServiceImpl(ExpertInputDAO expertInputDAO) {
        this.expertInputDAO = expertInputDAO;
    }

    @Override
    public void modifyExpert(Expert expert) {
        expertInputDAO.updateExpert(expert);
    }

    @Override
    public Expert getOriginalExpert(int expertIdx) {
        return expertInputDAO.selectOriginalExpert(expertIdx);
    }
}
