package com.fornula.domain.board.repository;

import java.util.List;

import com.fornula.domain.board.dto.Reviews;

public interface ReviewRepository {
	List<Reviews> selectReviews(int pageNum, int itemIdx);
	int countReview();
}
