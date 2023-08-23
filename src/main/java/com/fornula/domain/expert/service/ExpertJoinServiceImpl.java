package com.fornula.domain.expert.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.google.common.io.FileBackedOutputStream;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpertJoinServiceImpl implements ExpertJoinService {
	private final ExpertInputDAO expertInputDAO;
	private final WebApplicationContext context;
	
	@Override
	public void addExpertInfo(Expert expert) {
		expertInputDAO.insertExpertInfo(expert);
		
	}

}
