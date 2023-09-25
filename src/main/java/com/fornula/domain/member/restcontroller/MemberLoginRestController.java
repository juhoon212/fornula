package com.fornula.domain.member.restcontroller;


import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;




import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.vo.IdFindForm;
import com.fornula.domain.member.service.MemberLoginService;
import com.fornula.domain.member.service.MemberSecurityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/member")
@Slf4j
@RequiredArgsConstructor
public class MemberLoginRestController {
	
	private final MemberLoginService memberLoginService;
	private final MemberSecurityService memberSecurityService;
	
	
	
	@PostMapping("/findId")
	public Member findId(@RequestBody IdFindForm form) {
		
		Member findMember = memberLoginService.findByEmail(form.getEmail());
		
		log.info("findMember = {}", findMember.getId());
		
		return findMember;
	}
	
	
	
	
	
	
	
	
	
	
	
}