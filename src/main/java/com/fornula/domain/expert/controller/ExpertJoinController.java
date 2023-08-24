package com.fornula.domain.expert.controller;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class ExpertJoinController {
	private final ExpertJoinService expertJoinService;
	private final WebApplicationContext context;
	
	@GetMapping("/payment")
	public String pay() {
		return "payment";
	}
	@GetMapping("/sale")
	public String sale() {
		return "expert-sales";
	}

	@GetMapping("/expertjoin")
	public String join() {
		return "expert-join";
	}
	
	@PostMapping("/expertjoin")
	public String join(@ModelAttribute Expert expert, @RequestParam MultipartFile uploadFile, Model model)
			throws IllegalStateException, IOException{
		
		//삽입 처리시 이미 전문가로 등록된 회원에 대한 예외 처리
		
		
		//pdf 파일이 아닐 경우 메세지 띄움
		if(!uploadFile.getContentType().equals("upload/pdf")) {
			model.addAttribute("message","pdf 파일만 업로드해주세요.");
		}
		
		//업로드된 파일 경로 지정
		String uploadDirectory=context.getServletContext().getRealPath("/resource/upload");
		
		//uuid+파일이름으로 저장
		String expertfileName=UUID.randomUUID().toString()+"_"+uploadFile.getOriginalFilename();
		
		//expert객체의 필드값 저장
		expert.setExpertfileName(expertfileName);
		
		//파일 업로드 처리
		uploadFile.transferTo(new File(uploadDirectory,expertfileName));
		
		//테이블에 행 삽입 
		expertJoinService.addExpertInfo(expert);

		//전문가 등록시 메인페이지로 이동
		return "main";
	}
	
}
