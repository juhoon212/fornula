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
import com.fornula.domain.expert.dto.SaleItemExpert;
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
		@GetMapping("/sale")
		public String getSalesList(@ModelAttribute Expert originalExpert, HttpSession session, Model model){
			
			String originalFileName; // 원본 파일 이름
			int pos;
			
			//세션에 있는 member_idx를 가져오기
			Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
	    	Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
	    	int expertIdx = expert.getExpertIdx();
			log.info("expertIdx:{}",expertIdx);//로그출력

			System.out.println("aaa");
			List<SaleItemExpert> salesList = expertSalesService.getSalesList(expertIdx);//판매내역 리스트
			log.info("list:{}", salesList);// 로그출력
			
			int price = 0;//총금액 출력
			for(SaleItemExpert itemSales : salesList) {
				price+=itemSales.getPrice();
				
				pos = itemSales.getItemfileName().lastIndexOf("_");
				originalFileName = itemSales.getItemfileName().substring(pos + 1);
				
				itemSales.setItemfileName(originalFileName);
			}

			model.addAttribute("salesList", salesList);
			model.addAttribute("price", price);
			log.info("salesList:{}", salesList);
			log.info("price:{}", price);

			if (salesList.isEmpty()) {
				model.addAttribute("message", "판매내역이 존재하지 않습니다.");
				log.info("salesList:{}", salesList);
			}
			return "expert-sales";

		}

	}
