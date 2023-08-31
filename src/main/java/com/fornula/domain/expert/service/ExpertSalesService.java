package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.ItemSales;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ExpertSalesService {
	List<ItemSales> searchAndSelectSalesList(int salesStatus, String salesDate);
	List<ItemSales> getSalesList(int expertIdx);
	int modifySalesStatus(int salesIdx);
	Integer searchPrice(int expertIdx);
} 
