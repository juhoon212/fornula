package com.fornula.domain.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.repository.ReviewRepository;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImpl implements ReviewService{
	
	private final ReviewRepository reviewRepository;

	@Override
	public Map<String, Object> selectReviews(int pageNum, int itemIdx) {
		
		int countReview = reviewRepository.countReview(itemIdx);
		
		log.info("review 갯수 = {}", countReview);
		
		Pager pager=new Pager(pageNum, countReview, 6, 6);
		
		Map<String, Object> pageMap = new HashMap<>();
		pageMap.put("itemIdx", itemIdx);
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
	
		List<Reviews> reviewList = reviewRepository.selectReviews(pageMap);
		
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("reviewList", reviewList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}

	@Override
	public int addReview(Review review) {
		
		int addResult = reviewRepository.addReview(review);
		
		return addResult;
	}

	@Override
	public Purchase selectPurchase(int memberIdx, int itemIdx) {
		
		Purchase purchase = reviewRepository.selectPurchase(memberIdx, itemIdx);
		
		return purchase;
	}
	
	

}
