package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface ExpertSalesService {
	//List<ItemSales> searchAndSelectSalesList(int salesStatus, String salesDate);
	Map<String, Object> getSalesList(int pageNum, int expertIdx);
	int getSalesCount();
	//int modifySalesStatus(int salesIdx);
} 
