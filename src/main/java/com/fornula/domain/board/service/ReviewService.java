package com.fornula.domain.board.service;

import java.util.Map;

import com.fornula.domain.board.dto.Reviews;

public interface ReviewService {
	Map<String, Object> selectReviews(int pageNum, int itemIdx);
}
