package com.fornula.domain.expert.restcontroller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertInputService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ExpertInputRestController {
	private final ExpertInputService expertInputService;
//	전문가 정보 수정시에 사용할 메소드 
	@PutMapping("/modify")
	public String expertModify(@RequestBody Expert expert) {
		expert.setIntroduce(HtmlUtils.htmlEscape(expert.getIntroduce()));
		expert.setCareer(HtmlUtils.htmlEscape(expert.getCareer()));
		expert.setCompanyOne(HtmlUtils.htmlEscape(expert.getCompanyOne()));
		expert.setCompanyTwo(HtmlUtils.htmlEscape(expert.getCompanyTwo()));
		expert.setCompanyThree(HtmlUtils.htmlEscape(expert.getCompanyThree()));
		expert.setExpertfileName(HtmlUtils.htmlEscape(expert.getExpertfileName()));
		expert.setIntroduce(HtmlUtils.htmlEscape(expert.getIntroduce()));
		expert.setPhone(HtmlUtils.htmlEscape(expert.getPhone()));
		expertInputService.modifyExpert(expert);
		
		log.info("ExpertInputRestController 클래스의 expertModify() 메소드 실행");
		return "수정 성공";
	}

//	자신이 등록했던 게시물(상품)을 출력해주는 메소드
//	여차하면 ExpertOutputRestController로 이동
	/*
	@GetMapping("/list")
	public Map<String, Object> expertGet(@RequestParam(defaultValue="1")int pageNum){
		log.info("ExpertInputRestController 클래스의 expertGet() 메소드 실행");
		return expertInputService.getExpertBoardList(pageNum);
	}
	*/
}