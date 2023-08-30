package com.fornula.domain.board.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.mapper.java.ReviewMapper;

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

}
