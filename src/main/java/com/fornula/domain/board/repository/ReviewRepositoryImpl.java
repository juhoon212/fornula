package com.fornula.domain.board.repository;

import java.util.List;

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
	public List<Reviews> selectReviews(int pageNum, int itemIdx) {
		return sqlSession.getMapper(ReviewMapper.class).selectReivewList(pageNum, itemIdx);
	}

	@Override
	public int countReview() {
		// TODO Auto-generated method stub
		return 0;
	}

}
