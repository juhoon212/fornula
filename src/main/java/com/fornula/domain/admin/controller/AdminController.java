package com.fornula.domain.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

	private final AdminService adminService;
	
	@GetMapping ("/user")
	public String AdminMemberForm () {
		return "admin-user";
	}
	@PostMapping("/user")
	public String memberList(Model model) {
		List<AdminMember> memberList = adminService.memberList();
		model.addAttribute("memberList", memberList);
		return "admin-user";
	}
	
	@GetMapping ("/item")
	public String adminItemForm () {
		return "admin-item";
	}
	@PostMapping("/item")
	public String itemList(Model model) {
		List<AdminItem> itemList = adminService.itemList();
		model.addAttribute("itemList", itemList);
		return "admin-item";
	}
	
}
