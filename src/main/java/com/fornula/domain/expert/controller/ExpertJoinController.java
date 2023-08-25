package com.fornula.domain.expert.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertJoinService;
import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;
import com.google.common.util.concurrent.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ExpertJoinController {
	private final ExpertJoinService expertJoinService;
	private final WebApplicationContext context;

	@GetMapping("/sale")
	public String sale() {
		return "expert-sales";
	}
	@GetMapping("/login")
	public String login() {
		return "main";
	}

	
	@GetMapping("/expertjoin")
	public String join() {
		return "expert-join"; 
	}
	

	@PostMapping("/expertjoin")
	public String join(@ModelAttribute Expert expert, @RequestParam MultipartFile uploadFile, Model model) throws IllegalStateException, IOException {

		log.info("매핑 실행");
		System.out.println(uploadFile);
		System.out.println(expert);

		
		//Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		//expert.setMemberIdx(member.getMemberIdx());
		
		//log.info("sessionMember = {}", member);
		
		/*
		 * int interst= expertJoinService.searchExpertCategory(expert.getInterest());
		 * expert.setInterest(interst);
		 */
		
		//업로드된 파일이 pdf 파일이 아닐 경우
		if (!uploadFile.getContentType().equals("application/pdf")) {
			log.info("파일 업로드 검증 중");
			model.addAttribute("message","pdf 파일만 업로드해주세요.");
			return "expert-join";
		}else if(uploadFile.isEmpty()) {
			return "expert-fail";
		}

		String uploadDirectory = context.getServletContext().getRealPath("/resources/upload");
		log.info("filepath =" +uploadDirectory);

		String expertfileName = UUID.randomUUID().toString() + "_" + uploadFile.getOriginalFilename();
		log.info("filename =" +expertfileName);
		
		
		expert.setExpertfileName(expertfileName);

		try {
			uploadFile.transferTo(new File(uploadDirectory, expertfileName));
			System.out.println("파일 업로드 성공");
		}catch (IllegalStateException | IOException e) {
			System.out.println("파일 업로드 실패");
			e.printStackTrace();
		}

			
		expertJoinService.addExpertInfo(expert);
		
		return "main";

	}
}
