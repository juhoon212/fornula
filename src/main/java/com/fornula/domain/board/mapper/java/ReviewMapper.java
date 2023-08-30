package com.fornula.domain.board.mapper.java;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.item.dto.Purchase;

public interface ReviewMapper {
	List<Reviews> selectReview(Map<String, Object> map);
	int countReview(int itemIdx);
	int addReview(Review review);
	Purchase selectPurchase(@Param("memberIdx")int memberIdx, @Param("itemIdx")int itemIdx);
}
