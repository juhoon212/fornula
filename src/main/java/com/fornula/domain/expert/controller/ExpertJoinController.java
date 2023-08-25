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
		
		//���� ó���� �̹� �������� ��ϵ� ȸ���� ���� ���� ó��
		
		
		//pdf ������ �ƴ� ��� �޼��� ���
		if(!uploadFile.getContentType().equals("upload/pdf")) {
			model.addAttribute("message","pdf ���ϸ� ���ε����ּ���.");
		}
		
		//���ε�� ���� ��� ����
		String uploadDirectory=context.getServletContext().getRealPath("/resource/upload");
		
		//uuid+�����̸����� ����
		String expertfileName=UUID.randomUUID().toString()+"_"+uploadFile.getOriginalFilename();
		
		//expert��ü�� �ʵ尪 ����
		expert.setExpertfileName(expertfileName);
		
		//���� ���ε� ó��
		uploadFile.transferTo(new File(uploadDirectory,expertfileName));
		
		//���̺� �� ���� 
		expertJoinService.addExpertInfo(expert);

		//������ ��Ͻ� ������������ �̵�
		return "main";
	}
	
}
