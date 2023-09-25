package com.fornula.domain.expert.restcontroller;


import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.expert.service.ExpertSalesService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/expert")
public class ExpertSalesRestController {
	private final ExpertSalesService expertSalesService;
	
	@PreAuthorize("hasRole('ROLE_EXPERT')")
	@PutMapping("/sales/update")
	public String modifyStatus(@RequestBody Sales sales) {
		
		
		log.info("idx:{}",sales.getSalesIdx() );
		log.info("status:{}",sales.getSalesStatus() );
		log.info("sales:{}", sales );
		
		
		expertSalesService.modifySalesStatus(sales);
		expertSalesService.modifyPurchaseStatus(sales);
		
		return "success";
	}
 }
