package com.fornula.domain.item.restcontroller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.vo.ItemUpdateForm;
import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/item/update")
@RequiredArgsConstructor
public class RestItemUpdateController {
	
	private final ItemDetailService itemDetailService;
	
	@PostMapping
	public Object updateItem(@Valid @RequestBody ItemUpdateForm form , Errors errors) {
		
		// 실패 로직
		if(errors.hasErrors()) {
			errors.getAllErrors().stream().forEach((error) -> log.info("검증오류 = {}", error));
			return errors.getAllErrors();
		}
		
		//성공 로직
		
		Item itemParam = setItem(form);
		
		itemDetailService.updateItem(itemParam);
		
		log.info("updateItem 성공");
		
		return form;
	}
	
	// 상품수정 DTO 세팅
	private Item setItem(ItemUpdateForm form) {
		Item itemParam = new Item();
		
		itemParam.setItemIdx(form.getItemIdx());
		itemParam.setItemName(form.getItemName());
		itemParam.setItemContent(form.getItemName());
		itemParam.setCategoryIdx(form.getCategoryIdx());
		itemParam.setPrice(form.getPrice());
		
		return itemParam;
	}
}
