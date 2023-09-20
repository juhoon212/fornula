package com.fornula.domain.item.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.board.service.ReviewService;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.expert.service.ExpertOutputService;
import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.service.CartService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.item.service.ItemDetailServiceImpl;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.pager.Pager;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	private final ExpertInputService expertInputService;
	private final ItemDetailService itemDetailService;
	private final ReviewService reviewService;
	private final CartService cartService;


	@GetMapping("/{itemIdx}/{pageNum}")
	public String showItemsAndReviews(@PathVariable Integer itemIdx, 
				@PathVariable Integer pageNum,
				HttpSession session,
				Model model
				) {
		if (ObjectUtils.isEmpty(pageNum)) {
			pageNum = 1;
		}

		Item findItem = itemDetailService.getItem(itemIdx);
		findItem.setItemDate(findItem.getItemDate().substring(0, 10));
		Photo selectPhoto = itemDetailService.selectPhoto(itemIdx);

		String originalFileName = extractPhoto(selectPhoto); // 사진 로직

		model.addAttribute("item", findItem);
		model.addAttribute("originalFileName", originalFileName);

		Map<String, Object> selectReviews = reviewService.selectReviews(pageNum, itemIdx); // 게시판 로직

		if (selectReviews.get("reviewList") == null) {

			return "redirect:/400";
		}

		model.addAttribute("pager", selectReviews.get("pager"));
		model.addAttribute("reviewList", selectReviews.get("reviewList"));

		CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		 if(member != null) { 
			 int memberIdx = member.getMemberIdx();
			 log.info("memberIdx:{}", memberIdx);
			 Cart cartList =cartService.selectCartInfo(memberIdx, itemIdx); 
			 log.info("cart:{}",cartList); 
			 model.addAttribute("cartList", cartList);
		 }
		
		return "item";
	}

	private String extractPhoto(Photo selectPhoto) {

		int pos = selectPhoto.getItemfileName().lastIndexOf("_");
		String originalFileName = selectPhoto.getItemfileName().substring(pos + 1);

		return originalFileName;
	}

	@GetMapping("/{itemIdx}/expertoutput/{expertIdx}")
	public String goExpertOutput(@PathVariable Integer itemIdx, @ModelAttribute Expert originalExpert, Model model) {
		Item item = itemDetailService.getItem(itemIdx);
		Expert expert = expertInputService.getOriginalExpert(item.getExpertIdx());
		int expertIdx = expert.getExpertIdx();

		originalExpert = expertInputService.getOriginalExpert(expertIdx);
		model.addAttribute("item", item);
		model.addAttribute("expert", expert);
		model.addAttribute("originalExpert", originalExpert);

		log.info("Showing modify form for expertIdx: {}", expertIdx);
		log.info("Showing modify form for originalExpert: {}", originalExpert);

		return "expert-output";
	}
}