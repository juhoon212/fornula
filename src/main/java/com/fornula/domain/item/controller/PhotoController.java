package com.fornula.domain.item.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.item.service.ItemInsertService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/photo")
public class PhotoController {
	
	private final ItemDetailService itemDetailService;
	private final WebApplicationContext context;
	
	@GetMapping("/update/{itemIdx}")
	public String showUpdatePhoto(@PathVariable Integer itemIdx, Model model) {
		model.addAttribute("itemIdx", itemIdx);
		return "update-photo";
	}
	
	@PostMapping("/update/{itemIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String updatePhotoPost( @RequestParam(required = false) MultipartFile multipartFile,
								Model model, 
								@PathVariable Integer itemIdx, 
								RedirectAttributes redirectAttributes) throws IOException {
		
			if(multipartFile.isEmpty() ||!multipartFile.getContentType().equals("image/png")) {
				redirectAttributes.addFlashAttribute("message", "잘못된 파일입니다");
				redirectAttributes.addAttribute("itemIdx", itemIdx);
				return "redirect:/photo/update/{itemIdx}";
			}

			if(multipartFile.isEmpty() ||!multipartFile.getContentType().equals("image/png")) {
				throw new ItemNotFoundException("png파일만 등록 가능합니다.");
			}
			
			String uploadDirectory=context.getServletContext().getRealPath("/resources/images/upload/");
			log.info("filepath = {}", uploadDirectory);
			
			String uploadFileName = storePhotoName(multipartFile);
			
			Photo itemPhoto = transferPhoto(multipartFile, itemIdx, uploadDirectory, uploadFileName);
			
			itemDetailService.updatePhoto(itemPhoto);
			
			redirectAttributes.addAttribute("status", true);
			
			return "redirect:/expert/sales";
	}
	
	
	//	uploadFile의 경로를 저장하기 위한 메소드
	private Photo transferPhoto(MultipartFile multipartFile, Integer itemIdx, String uploadDirectory, String uploadFileName)
			throws IOException {
		Photo itemPhoto = itemDetailService.findByItemIdx(itemIdx);
		
		log.info("itemPhoto = {}", itemPhoto.getItemIdx());

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
