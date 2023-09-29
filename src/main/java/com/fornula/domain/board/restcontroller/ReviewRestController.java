package com.fornula.domain.board.restcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.ReviewForm;
import com.fornula.domain.board.service.ReviewService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/board/review")
@RequiredArgsConstructor
public class ReviewRestController {
	
	private final ReviewService reviewService;
	
	@PostMapping("/update/{reviewIdx}")
	public String updateReview(@RequestBody ReviewForm reviewForm, @PathVariable String reviewIdx) {
		
		Review findReview = reviewService.findReviewByReviewIdx(Integer.parseInt(reviewIdx));
		
		findReview.setContent(reviewForm.getContent());
		
		int updateReview = reviewService.updateReview(findReview);
		
		if(updateReview == 0) {
			return "fail";
		}
		
		return "success";
	}
}
