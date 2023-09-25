package com.fornula.domain.board.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.board.dto.Review;
import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.mapper.java.ReviewMapper;
import com.fornula.domain.item.dto.Purchase;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository{
	
	private final SqlSession sqlSession;

	@Override
	public List<Reviews> selectReviews(Map<String, Object> map) {
		return sqlSession.getMapper(ReviewMapper.class).selectReview(map);
	}


	@Override
	public int countReview(int itemIdx) {
		return sqlSession.getMapper(ReviewMapper.class).countReview(itemIdx);
	}
	
	@Override
	public List<Purchase> selectPurchase(int memberIdx, int itemIdx) {
		return sqlSession.getMapper(ReviewMapper.class).selectPurchase(memberIdx, itemIdx);
	}
	
	@Override
	public int addReview(Review review) {
		return sqlSession.getMapper(ReviewMapper.class).addReview(review);
	}


	@Override
	public int addReply(Review review) {
		return sqlSession.getMapper(ReviewMapper.class).addReply(review);
	}


	@Override
	public int updateReview(Review review) {
		return sqlSession.getMapper(ReviewMapper.class).updateReview(review);
	}


	@Override
	public Review findReviewByReviewIdx(int reviewIdx) {
		return sqlSession.getMapper(ReviewMapper.class).findReviewByReviewIdx(reviewIdx);
	}


	

}
