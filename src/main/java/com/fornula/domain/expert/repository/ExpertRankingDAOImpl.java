package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.TotalSalesMoney;
import com.fornula.domain.expert.dto.vo.ExpertMoneyRanking;
import com.fornula.domain.expert.mapper.java.ExpertRankingMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertRankingDAOImpl implements ExpertRankingDAO{
	private final SqlSession sqlSession;
	
	@Override
	public List<Expert> selectExpertList(Map<String, Object> map) {
		return sqlSession.getMapper(ExpertRankingMapper.class).selectExpertList(map);
	}
	
	@Override
	public int selectExpertCount() {
		return sqlSession.getMapper(ExpertRankingMapper.class).selectExpertCount();
	}
	
	@Override
	public List<ExpertMoneyRanking> selectTotalMoneyList(Map<String, Object> map) {
		return sqlSession.getMapper(ExpertRankingMapper.class).selectTotalMoneyList(map);
	}
	
	/*
	@Override
	public int selectMoneyCount() {
		return sqlSession.getMapper(ExpertRankingMapper.class).selectMoneyCount();
	}
	*/
}
