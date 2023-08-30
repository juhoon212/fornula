package com.fornula.domain.board.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;

public interface ReviewMapper {
	List<Reviews> selectReview(Map<String, Object> map);
	int countReview(int itemIdx);
	int addReview(Review review);
}
