package com.fornula.domain.admin.controller;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.service.AdminService;
import com.fornula.domain.member.dto.Member;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

	private final AdminService adminService;
	
	@GetMapping ("/user")
	public String userForm () {
		return "admin-user";
	}
	@PostMapping("/user")
	public String memberList(Model model) {
		List<AdminMember> list = adminService.memberList();
		model.addAttribute("list", list);
		return "admin-user";
	}
	
}
