package com.fornula.domain.expert.restcontroller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.service.ExpertSalesService;
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
	
	//판매내역을 출력하는 메소드
	@GetMapping("/list/{expertIdx}")
	public List<ItemSales> getSalesList(HttpSession session, @PathVariable int expertIdx){
		
		//세션에 있는 member_idx를 가져오기
		Member member = (Member)session.getAttribute(SessionConst.Login_Member);
		int memberIdx= member.getMemberIdx();
		log.info("memberIdx:{}",memberIdx);//로그출력
		
		Expert expert = new Expert(); //expert 객체에 세션에서 받은 memberIdx를 expert 객체의 memberIdx에 저장 
	    expert.setMemberIdx(memberIdx); //@pathVariable에 있는 expertIdx를 expert객체 에서 가져옴 
	    expertIdx = expert.getExpertIdx();
		
		System.out.println("aaa");
		List<ItemSales> salesList = expertSalesService.getSalesList();
		log.info("list:{}",salesList);//로그출력
		
		return salesList;
		
	}
	
	//날짜와 상태를 받아 판매내역을 출력하는 메소드
	@GetMapping("/search/{expertIdx}")
	public List<ItemSales> getSearchSalesList
	(@PathVariable int expertIdx, @RequestParam("salesStatus") int salesStatus, @RequestParam("salesDate") String salesDate){
		List<ItemSales> searchSalesList= expertSalesService.searchAndSelectSalesList(salesStatus, salesDate);
		log.info("searchSalesList:{}",searchSalesList );
		
		return searchSalesList;
		
	}
	
	//구매확정된 총 판매금액을 출력하는 메소드
	@GetMapping("/price/{expertIdx}")
	public ResponseEntity<Integer> getPrice(@PathVariable int expertIdx){
		int price= expertSalesService.searchPrice();
		log.info("price: {}",price);
		return ResponseEntity.ok(price);
	}
	
	//다중 조인으로 salesStatus를 변경해주는 메소드
	@PutMapping("/update/{expertIdx}/{salesIdx}")
	public ResponseEntity<Integer> updateSalesStatus(@PathVariable int salesIdx, 
			@PathVariable int expertIdx) {
		int updateSalesStatus = expertSalesService.modifySalesStatus(salesIdx);
		log.info("updateSalesStatus: {}",updateSalesStatus);
		return ResponseEntity.ok(updateSalesStatus);
	}
	
 }
