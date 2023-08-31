package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;

public interface ExpertSalesMapper {
	List<SaleItemExpert> selectSalesList(int expertIdx);
	int updateSalesStatus(int salesIdx);
	List<ItemSales> selectSearchSalesList(Map<String, Object> searchList);
	int selectExpertIdxByMemberIdx(int memberIdx);

}
