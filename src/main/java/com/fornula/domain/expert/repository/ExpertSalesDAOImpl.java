package com.fornula.domain.expert.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.expert.dto.TotalSalesMoney;
import com.fornula.domain.expert.mapper.java.ExpertJoinMapper;
import com.fornula.domain.expert.mapper.java.ExpertSalesMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertSalesDAOImpl implements ExpertSalesDAO {
	private final SqlSession sqlSession;
	/*
	@Override
	public List<ItemSales> selectSearchSalesList(int salesStatus, String salesDate) {
		Map<String, Object> searchList = new HashMap<>();
		searchList.put("salesDate", salesDate);
		searchList.put("salesStatus", salesStatus);
		
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSearchSalesList(searchList);
	}
	*/
	//판매 내역 출력 + 페이징 처리
	@Override
	public List<SaleItemExpert> selectSalesList(Map<String, Object> map) {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSalesList(map);
	}
	
	@Override
	public int selectSalesCount() {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectSalesCount();
	}
	
	
	@Override
	public int updateSalesStatus(Sales sales) {
		return sqlSession.getMapper(ExpertSalesMapper.class).updateSalesStatus(sales);
	}

	@Override
	public List<TotalSalesMoney> selectTotalMoney(int expertIdx) {
		return sqlSession.getMapper(ExpertSalesMapper.class).selectTotalMoney(expertIdx);
	}
	/*
	 * @Override public Sales selectStatus(int salesIdx) { return
	 * sqlSession.getMapper(ExpertSalesMapper.class).selectStatus(salesIdx); }
	 */
}