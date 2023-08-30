package com.fornula.domain.board.repository;

import java.util.List;
import java.util.Map;

import com.fornula.domain.board.dto.Reviews;

public interface ReviewRepository {
	List<Reviews> selectReviews(Map<String, Object> map);
	int countReview(int itemIdx);
}
