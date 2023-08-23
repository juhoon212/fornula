package com.fornula.domain.expert.mapper.java;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.Sales;

public interface ExpertSalesMapper {
	List<ItemSales> selectSearchSalesList();
	List<ItemSales> selectSalesList();
	int updateSalesStatus(int salesIdx);
	int selectPrice(int itemIdx);
}
