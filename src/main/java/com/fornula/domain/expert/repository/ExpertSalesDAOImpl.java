package com.fornula.domain.expert.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.mapper.java.ExpertJoinMapper;
import com.fornula.domain.expert.mapper.java.ExpertSalesMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertSalesDAOImpl implements ExpertSalesDAO {
	private final SqlSession sqlSession;
	
	@Override
	public List<ItemSales> selectSearchSalesList(int salesStatus, String salesDate) {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSearchSalesList();
	}

	@Override
	public List<ItemSales> selectSalesList() {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSalesList();
	}

	@Override
	public int updateSalesStatus(int salesIdx) {
		return sqlSession.getMapper(ExpertSalesMapper.class).updateSalesStatus(salesIdx);
	}

	@Override
	public int selectPrice(int salesStatus) {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectPrice(salesStatus);
	}

}
