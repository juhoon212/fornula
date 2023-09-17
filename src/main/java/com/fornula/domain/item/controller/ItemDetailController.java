package com.fornula.domain.item.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.board.service.ReviewService;
import com.fornula.domain.item.dto.Cart;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.service.CartService;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.item.service.ItemDetailServiceImpl;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.pager.Pager;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemDetailController {
	
	
	private final CartService cartService;
    private final ItemDetailService itemDetailService;
    private final ReviewService reviewService;
   
   @GetMapping("/{itemIdx}/{pageNum}")
   public String showItemsAndReviews(@PathVariable Integer itemIdx, 
		   				@PathVariable Integer pageNum,
		   				HttpSession session,
		   				Model model
		   				) {
	   
	   	if(ObjectUtils.isEmpty(pageNum)) {
	   		pageNum = 1;
	   	}

    	Item findItem = itemDetailService.getItem(itemIdx);
    	findItem.setItemDate(findItem.getItemDate().substring(0,10));
    	Photo selectPhoto = itemDetailService.selectPhoto(itemIdx);
    	log.info("selectPhoto:{}",selectPhoto);
    	
    	String originalFileName = extractPhoto(selectPhoto); // 사진 로직
    	
    	model.addAttribute("item", findItem);
    	model.addAttribute("originalFileName", originalFileName);
    	
    	
    	Map<String, Object> selectReviews = reviewService.selectReviews(pageNum, itemIdx); // 게시판 로직
    	
    	if(selectReviews.get("reviewList") == null) {
    		
    		return "redirect:/400";
    	}
    	
    	Member member = (Member) session.getAttribute(SessionConst.Login_Member);
		int memberIdx = member.getMemberIdx();
		log.info("memberIdx:{}", memberIdx);
		
		List<Cart> cartList = cartService.selectCartInfo(memberIdx, itemIdx);
		log.info("cart:{}", cartList);
		model.addAttribute("cartList", cartList);
		
		
		model.addAttribute("pager", selectReviews.get("pager"));
		model.addAttribute("reviewList", selectReviews.get("reviewList"));
		log.info("itemController: {}",selectReviews);
    	
    	return "item";
    }

   private String extractPhoto(Photo selectPhoto) {
	   
		int pos = selectPhoto.getItemfileName().lastIndexOf("_");
		String originalFileName = selectPhoto.getItemfileName().substring(pos + 1);
		
		return originalFileName;
   }
}