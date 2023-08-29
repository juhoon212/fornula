package com.fornula.domain.admin.controller;

import java.util.List;
import java.util.Map;

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
import com.fornula.domain.exception.custom.MemberNotFoundException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

	private final AdminService adminService;
	
	
	@RequestMapping("/user")
	public String memberList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
		
		Map<String, Object> map=adminService.memberList(pageNum);
		
		model.addAttribute("pager", map.get("pager"));
		model.addAttribute("memberList", map.get("memberList"));
		
		return "admin-user";
	}
	

	@RequestMapping("/memberupdate")
	public String memberUpdate(@RequestParam int memberIdx) throws MemberNotFoundException {
		adminService.updateMemberStatus(memberIdx);
		
		log.info("memberIdx:{}",memberIdx);
		
		return "redirect:/admin/user";
	}

	/*
	@GetMapping ("/item")
	public String adminItemForm (Model model) {
		List<AdminItem> itemList = adminService.itemList();
		model.addAttribute("itemList", itemList);
		return "admin-item";
	}
	*/
	
	@RequestMapping("/item")
	public String itemList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
		
		Map<String, Object> map=adminService.itemList(pageNum);
		
		model.addAttribute("pager", map.get("pager"));
		model.addAttribute("itemList", map.get("itemList"));
		
		return "admin-item";
	}
	
	@RequestMapping("/itemupdate")
	public String update(@RequestParam int itemIdx) throws ItemNotFoundException {
		adminService.updateItemStatus(itemIdx);
		
		log.info("itemIdx:{}",itemIdx);
		/*
		 * if(itemIdx) { throw new ItemNotFoundException("상품이 존재하지 않습니다."); }
		 */
		return "redirect:/admin/item";
	}


	
}
