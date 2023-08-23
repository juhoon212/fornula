package com.fornula.domain.expert.restcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.controller.ExpertController;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/member")
@Slf4j
@RequiredArgsConstructor
public class ExpertRestController {
	private final ExpertInputService expertInputService;
//	아놔 이거맞나? 왜안되지?

	
// 후 또 어떡하지
}
