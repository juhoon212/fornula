package com.fornula.domain.member.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.service.MypageItemService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/mypage")
public class MypageStatusRestController {
  private final MypageItemService mypageItemService;
  
	@PutMapping("/purchase/status")
	public String modifyStatus(@RequestBody Itempurchase itempurchase) {
		
		log.info("idx:{}",itempurchase.getPurchaseIdx() );
		log.info("status:{}",itempurchase.getPurchaseStatus());
		
		mypageItemService.modifyPurchaseStatus(itempurchase);
		
		return "success";
	}
}
