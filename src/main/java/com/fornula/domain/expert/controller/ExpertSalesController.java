package com.fornula.domain.expert.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.expert.service.ExpertSalesService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;
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
    	@PreAuthorize("hasRole('ROLE_EXPERT')")
    	@GetMapping("/sales")
		public String getSalesList(@RequestParam(defaultValue = "1") int pageNum
				, HttpSession session
				, Model model
				){
			
			String originalFileName; // 원본 파일 이름
			int pos;
			
			//세션에 있는 expert_idx를 가져오기
			CustomMemberDetails loginMember = (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
	    	Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
	    	int expertIdx = expert.getExpertIdx();
			//log.info("expertIdx:{}",expertIdx);//로그출력

			Map<String, Object> resultMap = expertSalesService.getSalesList(pageNum, expertIdx);//판매내역 리스트
			//log.info("list:{}", resultMap);// 로그출력
			
			
			//여기부터 안넘어
			List<SaleItemExpert> resultList= (List<SaleItemExpert>)resultMap.get("salesList");
			//log.info("resultList:{}",resultList);
			
			for(SaleItemExpert itemSalesList : resultList) {
				
				pos = itemSalesList.getItemfileName().lastIndexOf("_");
				originalFileName = itemSalesList.getItemfileName().substring(pos + 1);
				
				itemSalesList.setItemfileName(originalFileName);
				
			}
			
			
			
			model.addAttribute("salesList",resultMap.get("salesList"));
			model.addAttribute("pager",resultMap.get("pager")) ;
			
			int price = expertSalesService.getTotalMoney(expertIdx);
			String formatPrice = String.format("%,d", price);
			//log.info("price:{}", price);
			
			model.addAttribute("price", formatPrice);
			

			
			return "expert-sales";

		}

	}