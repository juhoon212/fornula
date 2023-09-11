package com.fornula.domain.item.restcontroller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemUpdateForm;
import com.fornula.domain.item.service.ItemDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/item")
@RequiredArgsConstructor
public class RestItemUpdateController {
	
	private final ItemDetailService itemDetailService;
	private final WebApplicationContext context;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/update")
	public Object updateItem(@Valid @RequestBody ItemUpdateForm form , Errors errors) throws IOException{
		
		// 실패 로직
		if(errors.hasErrors()) {
			errors.getAllErrors().stream().forEach((error) -> log.info("검증오류 = {}", error));
			return errors.getAllErrors();
		}
		
		//성공 로직
		
		
		log.info("상품 IDx = {}", form.getItemIdx());
		
		Item findItem = itemDetailService.findItemByIdx(form.getItemIdx()); // 받은 idx로 상품 검색
		
		Item updateItem = setItem(findItem, form); 
		
		log.info("categoryIdx = {}" , updateItem.getCategoryIdx());
		
		itemDetailService.updateItem(updateItem);
		
		log.info("updateItem 성공");
		
		return ResponseEntity.status(HttpStatus.OK).body(updateItem);
	}
	
	// 상품수정 DTO 세팅
	private Item setItem(Item originalItem, ItemUpdateForm form) {
		
		originalItem.setItemName(form.getItemName());
		originalItem.setItemContent(form.getItemName());
		originalItem.setCategoryIdx(form.getCategoryIdx());
		originalItem.setPrice(form.getPrice());
		
		return originalItem;
	}
	

	
	
}
