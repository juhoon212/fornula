package com.fornula.domain.expert.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.service.ExpertSalesService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/expert")
public class ExpertSalesController {
	private final ExpertSalesService expertSalesService;
    private final ItemDetailService itemDetailService;

	//판매내역을 출력하는 메소드
		@GetMapping("/list")
		public String getSalesList(@ModelAttribute Expert originalExpert, HttpSession session, Model model){
			
			//세션에 있는 member_idx를 가져오기
			Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
	    	Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
	    	int expertIdx = expert.getExpertIdx();
			log.info("expertIdx:{}",expertIdx);//로그출력
			
			
			System.out.println("aaa");
			List<ItemSales> salesList = expertSalesService.getSalesList();
			log.info("list:{}",salesList);//로그출력
			
			return "expert-sales";
			
		}

}
