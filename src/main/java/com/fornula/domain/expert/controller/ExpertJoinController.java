package com.fornula.domain.expert.controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.ExistsExpertException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertJoinService;
import com.fornula.domain.item.dto.Category;
import com.fornula.domain.member.dto.Auth;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.member.service.MypageInfoService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;
import com.google.common.util.concurrent.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/expert")
public class ExpertJoinController {
	private final ExpertJoinService expertJoinService;
	private final WebApplicationContext context;
	private final MypageInfoService service;
	private final MemberSecurityService memberSecurityService;

	@GetMapping("/success")
	public String success(Model model) {
		model.addAttribute("message","전문가 등록이 완료되었습니다.");
		return "expertjoin-success";
	}
	
	@PreAuthorize("hasRole('ROLE_MEMBER')")
	@GetMapping("/join")
	public String join(@ModelAttribute("expert") Expert expert, HttpSession session) {
		//세션에 저장된 member의 id를 출력하기 위한 메소드
		CustomMemberDetails  member = (CustomMemberDetails ) session.getAttribute(SessionConst.Login_Member);
		session.setAttribute("member", member.getId());

		return "expert-join";
	}
	
	@PreAuthorize("hasRole('ROLE_MEMBER')")
	@PostMapping("/join")
	public String join(@Valid @ModelAttribute("expert") Expert expert, Errors errors, 
			@RequestParam MultipartFile uploadFile, Model model,
			HttpSession session, RedirectAttributes redirectAttributes) 
					throws IllegalStateException, IOException, ExistsExpertException {
		
		if(errors.hasErrors()) {
	           model.addAttribute("expert",expert);
	           log.info("errors :{}", errors);
	           return "expert-join";
	        }
		
		log.info("expert:{}", expert);
		log.info("file:{}", uploadFile);

		//시큐리티 적용
		CustomMemberDetails loginMember = (CustomMemberDetails ) session.getAttribute(SessionConst.Login_Member);
		Member member = memberSecurityService.getSecurityMember(loginMember.getId());
		expert.setMemberIdx(member.getMemberIdx());
		log.info("MemberIdx:{}", member.getMemberIdx());


		// 업로드된 파일이 pdf 파일이 아닐 경우
		if (!uploadFile.isEmpty() && !uploadFile.getContentType().equals("application/pdf")) {
			log.info("file:{}", uploadFile);
			model.addAttribute("message", "pdf 파일만 업로드해주세요.");
			return "expert-join";
		}

		
		if(!uploadFile.isEmpty()) {
			String uploadDirectory = context.getServletContext().getRealPath("/resources/upload");
			log.info("filepath =" + uploadDirectory);
	
			String expertfileName = extracted(uploadFile);
			log.info("filename =" + expertfileName);
	
			expert.setExpertfileName(expertfileName);
		}

		expertJoinService.addExpertInfo(expert);

		// 등록처리에 성공하였을때 memberIdx 변경
		Auth auth = new Auth();
		auth.setId(member.getId());
		auth.setRole("ROLE_EXPERT");
		log.info("auth:{}",auth);
		
		expertJoinService.updateExpertStatus(auth);
		expertJoinService.updateStatus(member.getMemberIdx());
		
		log.info("memberSTatus :{}",member.getMemberStatus() );
		
		return "expertjoin-success";

	}
	private String extracted(MultipartFile uploadFile) {
		String expertfileName = UUID.randomUUID().toString() + "_" + uploadFile.getOriginalFilename();
		return expertfileName;
	}
	

}