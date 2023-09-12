package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.TotalSalesMoney;

public interface ExpertSalesMapper {
	//판매내역 페이징 처리
	List<SaleItemExpert> selectSalesList(Map<String, Object> map);
	int selectSalesCount();
	List<TotalSalesMoney> selectTotalMoney(int expertIdx);
	//판매내역 상태 변경
	int updateSalesStatus(int salesIdx);

}