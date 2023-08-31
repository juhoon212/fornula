package com.fornula.domain;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.item.controller.ItemBoardController;
import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.service.ItemBoardService;
import com.fornula.domain.item.service.ItemMainService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * 홈으로만 가는 컨트롤러 다른 것 작성 x
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class ErrorController {
	
	//메인페이지 상품 출력
	@GetMapping("/error")
	public String error(Model model) {
		
		return "error";
	}
	
	
}
