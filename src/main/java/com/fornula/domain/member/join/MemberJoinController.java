package com.fornula.domain.member.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;

@Controller
public class MemberJoinController {

	@Autowired
	private MemberJoinService memberJoinService;
	
	@RequestMapping(value ="/join", method = RequestMethod.POST)
	public String join(Member member) throws Exception {
		memberJoinService.insert(member);
		return "redirect:/";
	}
}
