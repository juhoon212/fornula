package com.fornula.domain.board.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.item.dto.Purchase;

public interface ReviewRepository {
	
	List<Reviews> selectReviews(Map<String, Object> map);
	
	int countReview(int itemIdx);
	
	int addReview(Review review);
	
	Purchase selectPurchase(int memberIdx, int itemIdx);
}
