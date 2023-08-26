package com.fornula.domain.expert.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.service.ExpertSalesService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/expert")
public class ExpertSalesRestController {
	private final ExpertSalesService expertSalesService;
	
	//판매내역을 출력하는 메소드
	@GetMapping("/list")
	public List<ItemSales> getSalesList(){
		System.out.println("aaa");
		List<ItemSales> salesList = expertSalesService.getSalesList();
		log.info("list:{}",salesList);//로그출력
		
		return salesList;
		
	}
	
	//날짜와 상태를 받아 판매내역을 출력하는 메소드
	@GetMapping("/search")
	public List<ItemSales> getSearchSalesList
	(@RequestParam("salesStatus") int salesStatus, @RequestParam("salesDate") String salesDate){
		List<ItemSales> searchSalesList= expertSalesService.searchAndSelectSalesList(salesStatus, salesDate);
		log.info("searchSalesList:{}",searchSalesList );
		
		return searchSalesList;
		
	}
	
	//구매확정된 총 판매금액을 출력하는 메소드
	@GetMapping("/price")
	public ResponseEntity<Integer> getPrice(){
		int price= expertSalesService.searchPrice();
		return ResponseEntity.ok(price);
	}
	
	//다중 조인으로 salesstatus를 변경해주는 메소드
	@PutMapping("/update/{salesIdx}")
	public ResponseEntity<Integer> updateSalesStatus(@PathVariable int salesIdx) {
		int updateSalesStatus = expertSalesService.modifySalesStatus(salesIdx);
		return ResponseEntity.ok(updateSalesStatus);
	}
	
 }
