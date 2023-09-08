package com.fornula.domain.expert.service;

import javax.validation.Valid;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.form.ExpertUpdateValidForm;

public interface ExpertInputService {
    void modifyExpert(Expert expert);
    Expert getOriginalExpert(int expertIdx);

}