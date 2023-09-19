package com.fornula.domain.expert.restcontroller;


import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.expert.dto.Status;
import com.fornula.domain.expert.service.ExpertSalesService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/expert")
public class ExpertSalesRestController {
	private final ExpertSalesService expertSalesService;
	private final ItemDetailService itemDetailService;
	
	@PutMapping("/sales/update/{salesIdx}")
	public String modifyStatus(@RequestBody SaleItemExpert status
			,@PathVariable int salesIdx
			, HttpSession session) {
		
		expertSalesService.modifySalesStatus(salesIdx);
		
		return "success";
	}
 }
