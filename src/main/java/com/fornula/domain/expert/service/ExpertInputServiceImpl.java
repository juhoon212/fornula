package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpertInputServiceImpl implements ExpertInputService {

    private final ExpertInputDAO expertInputDAO;

    // 입력값을 받아서 테이블의 값을 수정하는 메소드
    @Override
    public void modifyExpert(Expert expert) {
        expertInputDAO.updateExpert(expert);
    }
    
    // EXPERT 테이블에서 수정하기 이전, 기존의 정보를 출력하는 메소드
    @Override
    public Expert getOriginalExpert(int expertIdx) {
        return expertInputDAO.originalExpert(expertIdx);
    }
}
