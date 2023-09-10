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
	public String add(@PathVariable Integer expertIdx, @ModelAttribute ItemForm itemForm, Model model) {
		log.info("Received GET request for /item/add/{expertIdx}");
		log.info("expertIdx={}", expertIdx);
		log.info("itemForm={}", itemForm);

		model.addAttribute("itemForm", itemForm);
		model.addAttribute("expertIdx", expertIdx);
		return "item-add";
	}

	@PostMapping("/add/{expertIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String insert(@Valid @ModelAttribute ItemForm itemForm, @PathVariable Integer expertIdx, Errors errors,
			Model model, RedirectAttributes redirectAttributes) throws IllegalStateException, ExistsItemException {

		log.info("Received POST request for /item/add/{expertIdx}");
		log.info("expertIdx={}", expertIdx);

		if (errors.hasErrors()) {
			model.addAttribute("itemForm", itemForm);
			log.info("Validation errors: {}", errors);
			return "item-add";
		}
		
		log.info("itemForm", itemForm);
		
		itemForm.setExpertIdx(expertIdx);
		
		
//		model.addAttribute("itemForm", itemForm);
//	    상품 등록
//		아니 이 과정에서 내가 값을 입력안하면 validation이 발동되야하는데 왜 안되냐고 진짜 
		Item item = new Item();

		item.setExpertIdx(itemForm.getExpertIdx());
		log.info("item", item);
		item.setPrice(itemForm.getPrice());
		log.info("item", item);
		item.setItemName(itemForm.getItemName());
		log.info("item", item);
		item.setItemContent(itemForm.getItemContent());
		log.info("item", item);
		item.setCategoryIdx(itemForm.getCategoryIdx());
		log.info("item", item);
		
		int result = itemInsertService.addItem(item);
		
		if (result == 0) {
			redirectAttributes.addFlashAttribute("message", "상품등록에 실패하였습니다");
			return "redirect:/item/add";
		}
		log.info("result", result);
		log.info("check itemForm={}", itemForm);
		
		item.setItemStatus(1);
		
		log.info("itemstatus",item.getItemStatus());
		
		redirectAttributes.addAttribute("itemIdx", item.getItemIdx());
		return "redirect:/item/photo/add/{itemIdx}/"; // 등록한 상품의 사진 등록 페이지로 이동

	}

	@GetMapping("/photo/add/{itemIdx}")
	public String addPhoto(@PathVariable String itemIdx, Model model) {
		log.info("Received GET request for /item/photo/add/{itemIdx}");
		model.addAttribute("itemIdx", itemIdx);

		return "add-photo";
	}

	@PostMapping("/photo/add/{itemIdx}")
	@Transactional(rollbackFor = Exception.class)
	public String addPhotoPost(@RequestParam(required = false) MultipartFile multipartFile, Model model,
			@PathVariable Integer itemIdx, RedirectAttributes redirectAttributes) throws IOException {

		log.info("Received POST request for /item/photo/add/{itemIdx}");
		log.info("itemIdx={}", itemIdx);

		if (multipartFile.isEmpty() || !multipartFile.getContentType().equals("image/png")) {
			redirectAttributes.addFlashAttribute("message", "잘못된 파일입니다");
			redirectAttributes.addAttribute("itemIdx", itemIdx);
			return "redirect:/item/photo/add/{itemIdx}";
		}

//			uploadFile의 경로를 저장하기 위한 식
		String uploadDirectory = context.getServletContext().getRealPath("/resources/images/upload/");
		log.info("filepath = {}", uploadDirectory);
//			uploadFile의 파일이름(PHOTO 테이블의 itemFileName)을 저장하기 위한 식
		String uploadFileName = UUID.randomUUID().toString() + "_" + multipartFile.getOriginalFilename();

		Photo itemPhoto = new Photo();

		itemPhoto.setItemfileName(uploadFileName);
		itemPhoto.setItemIdx(itemIdx);

		multipartFile.transferTo(new File(uploadDirectory, uploadFileName));

		// DB에 photo 객체 저장å
		itemInsertService.addPhoto(itemPhoto);

		redirectAttributes.addAttribute("itemIdx", itemIdx);

		return "redirect:/item/{itemIdx}/1";
	}
}