package com.fornula.domain.board.mapper.java;

import com.fornula.domain.board.dto.Reviews;

public interface ReviewMapper {
	Reviews selectReivewList(int pageNum);
}
