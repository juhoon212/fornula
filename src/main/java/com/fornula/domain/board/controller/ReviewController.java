package com.fornula.domain.board.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.ReviewForm;
import com.fornula.domain.board.service.ReviewService;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/board")
@Slf4j
@RequiredArgsConstructor
public class ReviewController {
	
	private final ReviewService reviewService;
	private final MemberSecurityService memberSecurityService;
	
	@PreAuthorize("hasRole('ROLE_EXPERT')")
	@PostMapping("/add/{itemIdx}")
	public String addBoard(@ModelAttribute ReviewForm form,
							HttpSession session,
							RedirectAttributes redirectAttributes,
							@PathVariable Integer itemIdx) {
		
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		
		
		
		if(loginMember == null) {
			redirectAttributes.addAttribute("itemIdx", itemIdx);
			return "redirect:/item/{itemIdx}/1";
		}
		
		Member securityMember = memberSecurityService.getSecurityMember(loginMember.getId());
		
		
		Purchase purchase = reviewService.selectPurchase(securityMember.getMemberIdx(), itemIdx);
		
		if(purchase == null) {
			redirectAttributes.addAttribute("status", false);
			redirectAttributes.addAttribute("itemIdx", itemIdx);
			redirectAttributes.addFlashAttribute("message", "결제 한 사람만 댓글을 달 수 있습니다.");
			return "redirect:/item/{itemIdx}/1";
		}
		
		Review review = new Review();
		review.setPurchaseIdx(purchase.getPurchaseIdx());
		
		if(review.getScore() == 0) {
			review.setScore(1);
		}
		
		review.setScore(form.getScore());
		review.setContent(form.getContent());
		
		int addResult = reviewService.addReview(review);
		
		if(addResult == 0) {
			return "404";
		}
		
		redirectAttributes.addAttribute("itemIdx", itemIdx);
		
		return "redirect:/item/{itemIdx}/1";
	}
	
	@PreAuthorize("hasRole('ROLE_EXPERT')")
	@GetMapping("/add/reply/{itemIdx}/{reviewIdx}")
	public String showReplyForm(@PathVariable Integer itemIdx, @PathVariable Integer reviewIdx, Model model) {
		
		model.addAttribute("itemIdx", itemIdx);
		model.addAttribute("reviewIdx", reviewIdx);
		
		return "reply";
	}
	
	@PostMapping("/add/reply/{itemIdx}")
	@PreAuthorize("hasRole('ROLE_EXPERT')")
	public String addReply(@ModelAttribute Review review, @PathVariable Integer itemIdx, RedirectAttributes redirectAttributes, HttpSession session) {
		
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		Member member = memberSecurityService.getSecurityMember(loginMember.getId());
		reviewService.addReply(review, itemIdx, member.getMemberIdx());

		return "redirect:/item/{itemIdx}/1";
	}
	
	// 리뷰 수정 페이지
	@GetMapping("/review/update/{reviewIdx}/{itemIdx}")
	@PreAuthorize("isAuthenticated()")
	public String updateReview(@PathVariable String reviewIdx, @PathVariable int itemIdx, Model model) {
		
		model.addAttribute("reviewIdx", reviewIdx);
		model.addAttribute("itemIdx", itemIdx);
		
		return "review-update";
	}
	
	
}
