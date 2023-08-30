package com.fornula.domain.expert.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.repository.ExpertSalesDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpertSalesServiceImpl implements ExpertSalesService{
	private final ExpertSalesDAO expertSalesDAO;
	
	@Override
	public List<ItemSales> getSalesList(int expertIdx) {
		return expertSalesDAO.selectSalesList(expertIdx);
	}

	@Override
	public List<ItemSales> searchAndSelectSalesList(int salesStatus, String salesDate) {
		return expertSalesDAO.selectSearchSalesList(salesStatus, salesDate);
	}

	@Override
	public int searchPrice() {
		return expertSalesDAO.selectPrice();
	}

	@Override
	public int modifySalesStatus(int salesIdx) {
		return expertSalesDAO.updateSalesStatus(salesIdx);
	}

}
