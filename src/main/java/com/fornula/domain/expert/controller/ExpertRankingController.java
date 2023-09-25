package com.fornula.domain.expert.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.expert.service.ExpertRankingService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/expert")
public class ExpertRankingController {
	private final ExpertRankingService expertRankingService;
	private final ExpertInputService expertInputService;
	
	
//	전문가 리스트 출력 메소드
	@GetMapping("/ranking")
	public String getExpertList(@RequestParam(defaultValue = "1") int pageNum
								,Model model) {
			
		Map<String, Object> resultMap=expertRankingService.getExpertList(pageNum);
//		log.info("pager={}",resultMap.get("expertBoardList"));
		
		model.addAttribute("pager",resultMap.get("pager"));
		model.addAttribute("expertBoardList", resultMap.get("expertBoardList"));
		
		Map<String, Object> resultMoney=expertRankingService.getMoneyList(pageNum);
		log.info("pager={}",resultMoney.get("expertMoneyList"));
		log.info("로그테스트");
		
		model.addAttribute("pager",resultMoney.get("pager"));
		model.addAttribute("expertMoneyList", resultMoney.get("expertMoneyList"));
		
		return "expert-ranking";
	}
	
//	전문가 클릭시 포트폴리오로 넘기기
	@GetMapping("/output/{expertIdx}")
	public String goExpertOutput(@PathVariable Integer expertIdx, @ModelAttribute Expert originalExpert, Model model) {
		Expert expert = expertInputService.getOriginalExpert(expertIdx);

		originalExpert = expertInputService.getOriginalExpert(expertIdx);

		model.addAttribute("expert", expert);
		model.addAttribute("originalExpert", originalExpert);

//		log.info("Showing modify form for expertIdx: {}", expertIdx);
//		log.info("Showing modify form for originalExpert: {}", originalExpert);

		return "expert-output";
	}
}