package com.fornula.domain.board.service;

import java.util.Map;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.item.dto.Purchase;

public interface ReviewService {
	Map<String, Object> selectReviews(int pageNum, int itemIdx);
	
	int addReview(Review review);
	
	int addReply(Review review, int memberIdx, int itemIdx);
	
	Purchase selectPurchase(int memberIdx, int itemIdx);
	
}
