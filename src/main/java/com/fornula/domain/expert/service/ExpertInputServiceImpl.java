package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.form.ExpertUpdateValidForm;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpertInputServiceImpl implements ExpertInputService {

    private final ExpertInputDAO expertInputDAO;

	@Override
	public void modifyExpert(Expert expert) {
		expertInputDAO.updateExpert(expert);
	}

	@Override
	public Expert getOriginalExpert(int expertIdx) {
		return expertInputDAO.originalExpert(expertIdx);
	}

}
