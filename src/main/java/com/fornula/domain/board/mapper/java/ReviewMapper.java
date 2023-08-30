package com.fornula.domain.board.mapper.java;

import java.util.List;

import com.fornula.domain.board.dto.Reviews;

public interface ReviewMapper {
	List<Reviews> selectReivewList(int itemIdx, int pageNum);
	int countReview();
}
