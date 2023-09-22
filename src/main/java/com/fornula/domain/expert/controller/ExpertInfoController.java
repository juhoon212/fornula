package com.fornula.domain.expert.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.item.service.ItemDetailService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/expert")
@Slf4j
public class ExpertInfoController {
	private final ExpertInputService expertInputService;
	private final ItemDetailService itemDetailService;
	private final HttpSession session; // HttpSession 추가
	private final WebApplicationContext context;

	// 전문가 포트폴리오에서 정보 출력
	@GetMapping("/output")
	public String getExpert(@ModelAttribute Expert originalExpert, Model model) {
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
		int expertIdx = expert.getExpertIdx();

		log.info("Expert Info: expertIdx={}, phone={}, interest={}, career={}, companyOne={}, companyTwo={}, companyThree={}, introduce={}",
				expert.getExpertIdx(), expert.getPhone(), expert.getInterest(), expert.getCareer(),
				expert.getCompanyOne(), expert.getCompanyTwo(), expert.getCompanyThree(), expert.getIntroduce());

		//기존 전문가 정보 조회
		originalExpert = expertInputService.getOriginalExpert(expertIdx);
		model.addAttribute("loginMember", loginMember);
		model.addAttribute("originalExpert", originalExpert);

		log.info("Showing modify form for memberIdx: {}", loginMember.getMemberIdx());
		log.info("Showing modify form for expertIdx: {}", expertIdx);
		log.info("Showing modify form for originalExpert: {}", originalExpert);

		return "expert-output";
	}

	@GetMapping("/input")
	public String getOriginalExpert(@ModelAttribute Expert originalExpert,
			Model model, HttpSession session) {
		// 세션에 저장된 experIdx를 가져오기
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
		int expertIdx = expert.getExpertIdx();

		log.info(
				"Expert Info: expertIdx={}, phone={}, interest={}, career={}, companyOne={}, companyTwo={}, companyThree={}, introduce={}",
				expert.getExpertIdx(), expert.getPhone(), expert.getInterest(), expert.getCareer(),
				expert.getCompanyOne(), expert.getCompanyTwo(), expert.getCompanyThree(), expert.getIntroduce());

//      //기존 전문가 정보 조회
		originalExpert = expertInputService.getOriginalExpert(expertIdx);
		model.addAttribute("loginMember", loginMember);
		model.addAttribute("originalExpert", originalExpert);

		log.info("Showing modify form for expertIdx: {}", expertIdx);
		log.info("Showing modify form for originalExpert: {}", originalExpert);

		return "expert-input";
	}

	@PostMapping("/input")
	public String modifyExpert(@ModelAttribute Expert expert, Model model,
			@RequestParam MultipartFile uploadFile) throws IOException {
		log.info("Modifying expert information for expertIdx: {}", expert.getExpertIdx());

		/*
		 * if (errors.hasErrors()) { model.addAttribute("originalExpert", expert);
		 * log.info("errors :{}", errors); return "expert-input"; }
		 */

		if (!uploadFile.isEmpty() && !uploadFile.getContentType().equals("application/pdf")) {
			log.info("file:{}", uploadFile);
			model.addAttribute("message", "pdf 파일만 업로드해주세요.");
			return "expert-input";
		}

		if (!uploadFile.isEmpty()) {
			String uploadDirectory = context.getServletContext().getRealPath("/resources/images/portfolio");
			log.info("filepath =" + uploadDirectory);

			String expertfileName = UUID.randomUUID().toString() + "_" + uploadFile.getOriginalFilename();
			log.info("filename =" + expertfileName);

			expert.setExpertfileName(expertfileName);
			
			File file=new File(uploadDirectory, expertfileName);
			
			uploadFile.transferTo(file);
			model.addAttribute("uploadDirectory", uploadDirectory);
			model.addAttribute("expertfileName", expertfileName);

		}
		
		expertInputService.modifyExpert(expert);
		model.addAttribute("message", "전문가 수정을 완료하였습니다.");

		return "expertupdate-success";
	}
}