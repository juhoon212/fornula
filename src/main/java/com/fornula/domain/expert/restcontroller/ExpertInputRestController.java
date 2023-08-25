package com.fornula.domain.expert.restcontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.fornula.domain.expert.controller.ExpertController;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/input")
@RequiredArgsConstructor
@Slf4j
public class ExpertInputRestController {
	private final ExpertInputService expertInputService;
//	�쟾臾멸� �젙蹂� �닔�젙�떆�뿉 �궗�슜�븷 硫붿냼�뱶 
	@PutMapping("/modify")
	public String expertModify(@RequestBody Expert expert) {
		expert.setCareer(HtmlUtils.htmlEscape(expert.getCareer()));
		expert.setCompanyOne(HtmlUtils.htmlEscape(expert.getCompanyOne()));
		expert.setCompanyTwo(HtmlUtils.htmlEscape(expert.getCompanyTwo()));
		expert.setCompanyThree(HtmlUtils.htmlEscape(expert.getCompanyThree()));
		expert.setExpertfileName(HtmlUtils.htmlEscape(expert.getExpertfileName()));
		expert.setIntroduce(HtmlUtils.htmlEscape(expert.getIntroduce()));
		expert.setPhone(HtmlUtils.htmlEscape(expert.getPhone()));
		expertInputService.modifyExpert(expert);
		
		log.info("ExpertInputRestController �겢�옒�뒪�쓽 expertModify() 硫붿냼�뱶 �떎�뻾");
		return "�닔�젙 �꽦怨�";
	}
//	�옄�떊�씠 �벑濡앺뻽�뜕 寃뚯떆臾�(�긽�뭹)�쓣 異쒕젰�빐二쇰뒗 硫붿냼�뱶
//	�뿬李⑦븯硫� ExpertOutputRestController濡� �씠�룞
	@GetMapping("/list")
	public Map<String, Object> expertGet(@RequestParam(defaultValue="1")int pageNum){
		log.info("ExpertInputRestController �겢�옒�뒪�쓽 expertGet() 硫붿냼�뱶 �떎�뻾");
		return expertInputService.getExpertBoardList(pageNum);
	}
}