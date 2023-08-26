package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.ItemSales;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ExpertSalesService {
	//ItemSales searchAndSelectSalesList();
	List<ItemSales> getSalesList();
	//int modifySalesStatus(int salesIdx);
	//int searchPrice(int salesStatus);
} 
