package com.fornula.domain.expert.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.expert.dto.ItemSales;

public interface ExpertSalesMapper {
	List<ItemSales> selectSalesList();
	int updateSalesStatus(int salesIdx);
	int selectPrice();
	List<ItemSales> selectSearchSalesList(Map<String, Object> searchList);
	int selectExpertIdxByMemberIdx(int memberIdx);

}
