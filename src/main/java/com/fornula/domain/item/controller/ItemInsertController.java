package com.fornula.domain.item.controller;

 

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.ExistsItemException;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.vo.ItemForm;
import com.fornula.domain.item.service.ItemInsertService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/item")
public class ItemInsertController {
	private final ItemInsertService itemInsertService;
	private final WebApplicationContext context;

	@GetMapping("/add/{expertIdx}")
	public String add(@PathVariable Integer expertIdx, Model model) {
		
		model.addAttribute("expertIdx", expertIdx);
		
		return "item-add";
	}
	
	@PostMapping("/add/{expertIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String insert(	@Valid
							@ModelAttribute ItemForm itemForm,
							@PathVariable Integer expertIdx,
							Errors errors,
							Model model,
							RedirectAttributes redirectAttributes){
		
		log.info("상품 등록을 하는 전문가 번호:{}",expertIdx);
		log.info("itemName:{}",itemForm.getItemName());		
		
	    if (errors.hasErrors()) {
	    	model.addAttribute("expertIdx", expertIdx);
		    model.addAttribute("itemForm", itemForm);
	        log.info("errors :{}", errors);
	        return "item-add";
         }
		
	    model.addAttribute("itemForm", itemForm);
//	    상품 등록
		Item item = new Item();
		
		item.setExpertIdx(itemForm.getExpertIdx());
		item.setPrice(itemForm.getPrice());
		item.setItemName(itemForm.getItemName());
		item.setItemContent(itemForm.getItemContent());
		item.setCategoryIdx(itemForm.getCategoryIdx());

		
	    redirectAttributes.addAttribute("itemIdx", item.getItemIdx());
	    log.info("상품 등록 성공 사진등록하러 ㄱ:{}", item.getItemIdx());
		
		return "redirect:/item/photo/add/{itemIdx}/"; // 등록한 상품 상세페이지로 이동 
	}
	
	@GetMapping("/photo/add/{itemIdx}")
	public String addPhoto(@PathVariable String itemIdx, Model model) {
		
		model.addAttribute("itemIdx", itemIdx);
		
		return "add-photo";
	}
	
	
	@PostMapping("/photo/add/{itemIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String addPhotoPost( @Valid
								@RequestParam(required = false) MultipartFile multipartFile,
								Errors errors,
								Model model, 
								@PathVariable Integer itemIdx, 
								ItemForm itemForm,
								RedirectAttributes redirectAttributes) throws IOException {
		
			log.info("expertIdx={}",itemForm.getExpertIdx());
		
//			validation 하면서 추가
	        if(errors.hasErrors()) {
				redirectAttributes.addAttribute("itemIdx", itemIdx);
	            log.info("errors :{}", errors);
				return "redirect:/item/photo/add/{itemIdx}";
	         }
		
			if(multipartFile.isEmpty() ||!multipartFile.getContentType().equals("image/png")) {
				redirectAttributes.addFlashAttribute("message", "잘못된 파일입니다");
				redirectAttributes.addAttribute("itemIdx", itemIdx);
				return "redirect:/item/photo/add/{itemIdx}";
			}
			
			
//			uploadFile의 경로를 저장하기 위한 식
			String uploadDirectory=context.getServletContext().getRealPath("/resources/images/upload/");
			log.info("filepath = {}", uploadDirectory);
//			uploadFile의 파일이름(PHOTO 테이블의 itemFileName)을 저장하기 위한 식
			String uploadFileName = UUID.randomUUID().toString()+"_"+ multipartFile.getOriginalFilename();
			
			Photo itemPhoto = new Photo();
	
			itemPhoto.setItemfileName(uploadFileName);
			itemPhoto.setItemIdx(itemIdx);
			
			multipartFile.transferTo(new File(uploadDirectory , uploadFileName));
			
			// DB에 photo 객체 저장å
			itemInsertService.addPhoto(itemPhoto);
		
		
		redirectAttributes.addAttribute("itemIdx", itemIdx);
		
		
		return "redirect:/item/{itemIdx}/1";
	}	
	
}