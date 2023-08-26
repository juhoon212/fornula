package com.fornula.domain.expert.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.service.ExpertSalesService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExpertSalesRestController {
	private final ExpertSalesService expertSalesService;
	
	@GetMapping("/main")
	public List<ItemSales> salesList(){
		log.info("list ="+saleslist.toString());
		
		return expertSalesService.getSalesList(saleslist);
		
	}
 }
