package com.fornula.domain.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;
import com.fornula.domain.admin.service.AdminService;
import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

	private final AdminService adminService;
	
	
	@GetMapping ("/user")
	public String AdminMemberForm (Model model) {
		List<AdminMember> memberList = adminService.memberList();
		model.addAttribute("memberList", memberList);
		return "admin-user";
	}
	
	/*
	@PostMapping("/user")
	public String memberList(Model model) {
		List<AdminMember> memberList = adminService.memberList();
		model.addAttribute("memberList", memberList);
		return "admin-user";
	}
	*/

	
	@GetMapping ("/item")
	public String adminItemForm (Model model) {
		List<AdminItem> itemList = adminService.itemList();
		model.addAttribute("itemList", itemList);
		return "admin-item";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam int itemIdx) throws ItemNotFoundException {
		adminService.updateItemStatus(itemIdx);
		
		log.info("itemIdx:{}",itemIdx);
		/*
		 * if(itemIdx) { throw new ItemNotFoundException("상품이 존재하지 않습니다."); }
		 */
		return "redirect:/admin/item";
	}
	
	
}
