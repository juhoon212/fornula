package com.fornula.domain.expert.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.repository.ExpertOutputDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpertOutputServiceImpl implements ExpertOutputService{
	private final ExpertOutputDAO expertOutputDAO;
// Expert테이블에서 Expert에 대한 정보를 출력하는 테이블 	
	@Override
	public Expert getExpert(int expertIdx) {
		return expertOutputDAO.selectExpert(expertIdx);
	}
}
