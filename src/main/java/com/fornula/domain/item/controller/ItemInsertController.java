package com.fornula.domain.item.controller;

 

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
	public String insert(	@ModelAttribute ItemForm itemForm,
							@PathVariable Integer expertIdx,
							RedirectAttributes redirectAttributes) {
		
		Item item = new Item();
		
		setItemInfo(itemForm, item);
		
		int result=itemInsertService.addItem(item);
		
		if(result==0) {
			redirectAttributes.addFlashAttribute("message","상품등록에 실패하였습니다");
			return "redirect:/item/add";
		}
		
		redirectAttributes.addAttribute("itemIdx", item.getItemIdx());
		
		return "redirect:/item/photo/add/{itemIdx}/"; // 등록한 상품 상세페이지로 이동 
	}

	private void setItemInfo(ItemForm itemForm, Item item) {
		item.setExpertIdx(itemForm.getExpertIdx());
		item.setPrice(itemForm.getPrice());
		item.setItemName(itemForm.getItemName());
		item.setItemContent(itemForm.getItemContent());
		item.setCategoryIdx(itemForm.getCategoryIdx());
	}
	
	
	@GetMapping("/photo/add/{itemIdx}")
	public String addPhoto(@PathVariable String itemIdx, Model model) {
		
		model.addAttribute("itemIdx", itemIdx);
		
		return "add-photo";
	}
	
	
	@PostMapping("/photo/add/{itemIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String addPhotoPost( @RequestParam(required = false) MultipartFile multipartFile,
								Model model, 
								@PathVariable Integer itemIdx, 
								RedirectAttributes redirectAttributes) throws IOException {
		
			if(multipartFile.isEmpty() ||!multipartFile.getContentType().equals("image/png")) {
				redirectAttributes.addFlashAttribute("message", "잘못된 파일입니다");
				redirectAttributes.addAttribute("itemIdx", itemIdx);
				return "redirect:/item/photo/add/{itemIdx}";
			}
			

//			uploadFile의 경로를 저장하기 위한 식
			String uploadDirectory=context.getServletContext().getRealPath("/resources/images/upload/");
			log.info("filepath = {}", uploadDirectory);
			
			String uploadFileName = storePhotoName(multipartFile);
			
			Photo itemPhoto = transferPhoto(multipartFile, itemIdx, uploadDirectory, uploadFileName);
			
			itemInsertService.addPhoto(itemPhoto);
		
		
			redirectAttributes.addAttribute("itemIdx", itemIdx);
		
		
			return "redirect:/item/{itemIdx}/1";
	}
	
	
	//	uploadFile의 경로를 저장하기 위한 메소드
	private Photo transferPhoto(MultipartFile multipartFile, Integer itemIdx, String uploadDirectory, String uploadFileName)
			throws IOException {
		Photo itemPhoto = new Photo();

		itemPhoto.setItemfileName(uploadFileName);
		itemPhoto.setItemIdx(itemIdx);
		
		multipartFile.transferTo(new File(uploadDirectory , uploadFileName));
		return itemPhoto;
	}

	private String storePhotoName(MultipartFile multipartFile) {
		String uploadFileName = UUID.randomUUID().toString()+"_"+ multipartFile.getOriginalFilename();
		return uploadFileName;
	}	
}
