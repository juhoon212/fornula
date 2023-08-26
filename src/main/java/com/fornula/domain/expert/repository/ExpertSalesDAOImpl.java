package com.fornula.domain.expert.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
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
		Map<String, Object> searchList = new HashMap<>();
		searchList.put("salesDate", salesDate);
		searchList.put("salesStatus", salesStatus);
		
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSearchSalesList(searchList);
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
	public int selectPrice() {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectPrice();
	}
}
