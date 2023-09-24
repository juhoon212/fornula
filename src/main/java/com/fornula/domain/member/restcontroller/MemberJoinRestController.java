package com.fornula.domain.member.restcontroller;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.join.Message;
import com.fornula.domain.member.dto.vo.IdCheckForm;
import com.fornula.domain.member.service.MemberJoinService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberJoinRestController {
	
	private final MemberJoinService memberJoinService;
	
	private boolean isValid(String id) {
		return id.matches("^[a-zA-Z0-9]{6,20}$");
	}
	
	@PostMapping("/idCheck")
	public Message idCheck(@RequestBody IdCheckForm form) {
		
		 if (StringUtils.isEmpty(form.getId())) {
		        return new Message("아이디를 입력해 주세요.");
		    }
		    
		
		log.info("Id 중복검사 id = {}", form.getId());
		
		  if (!isValid(form.getId())) {
		        return new Message("아이디는 6~20자 영문 숫자 조합이어야 합니다.");
		    }
		
		Member idCheck = memberJoinService.idCheck(form.getId());
		
		log.info("idCheck isNull? = {}", idCheck);
		
		if(ObjectUtils.isEmpty(idCheck)) {
			return new Message("사용가능한 아이디입니다.");
		}
		
		
		
		return new Message("사용 불가능한 아이디입니다.");
	}
	
	
}