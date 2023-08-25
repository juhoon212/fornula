package com.fornula.domain.expert.service;

import com.fornula.domain.expert.dto.ItemSales;

public interface ExpertSalesService {
	ItemSales searchAndSelectSalesList();
	void searchSalesList();
	int modifySalesStatus(int salesIdx);
	int searchPrice(int salesStatus);
} 
