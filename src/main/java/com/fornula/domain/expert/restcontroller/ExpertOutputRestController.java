package com.fornula.domain.expert.restcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertOutputService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/output")
@RequiredArgsConstructor
@Slf4j
public class ExpertOutputRestController {
	private final ExpertOutputService expertOutputService;
//	전문가 테이블에서 전문가 정보를 가져와서 출력해주는 메소드 
	@PostMapping("/get/{expertIdx}")
	public Expert expertGet(@PathVariable int expertIdx) {
		log.info("ExpertOutputRestController 클래스의 expertGet()메소드");
		return expertOutputService.getExpert(expertIdx);
	} 
}
