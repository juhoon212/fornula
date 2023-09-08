package com.fornula.domain.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.repository.ReviewRepository;
import com.fornula.domain.exception.custom.NoAuthReplyException;
import com.fornula.domain.exception.custom.NotFoundPurchaseException;
import com.fornula.domain.exception.custom.NotFoundReviewException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Purchase;
import com.fornula.domain.item.repository.ItemDetailDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImpl implements ReviewService{
	
	private final ReviewRepository reviewRepository;
	private final ItemDetailDAO itemDetailDAO;

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
		
		List<Purchase> selectPurchase = reviewRepository.selectPurchase(memberIdx, itemIdx);
		
		Purchase purchase = selectPurchase.stream().findFirst().orElseThrow(() -> new NotFoundPurchaseException("구매내역을 찾을 수 없습니다"));
		
		return purchase;
	}

	@Override
	public int addReply(Review review, int memberIdx, int itemIdx) {
		
		Expert loginExpert = itemDetailDAO.findByMemberIdx(memberIdx);
		Item boardItem = itemDetailDAO.selectItem(itemIdx);
		
		
		if(ObjectUtils.isEmpty(loginExpert) || ObjectUtils.isEmpty(boardItem) || loginExpert.getExpertIdx() != boardItem.getExpertIdx()) {
			throw new NoAuthReplyException("댓글을 달 권한이 없습니다");
		}
		
		int result = reviewRepository.addReply(review);
		
		if(result == 0) {
			throw new NotFoundReviewException("후기가 추가되지 않았습니다.");
		}
		
		return result;
	}
	
	

}
