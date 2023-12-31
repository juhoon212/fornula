package com.fornula.domain.expert.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.Sales;
import com.fornula.domain.expert.dto.TotalSalesMoney;
import com.fornula.domain.expert.repository.ExpertSalesDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExpertSalesServiceImpl implements ExpertSalesService{
	private final ExpertSalesDAO expertSalesDAO;
 
	@Override
	public Map<String, Object> getSalesList(int pageNum, int expertIdx) {
		int totalSales = expertSalesDAO.selectSalesCount();
		
		Pager pager = new Pager(pageNum, totalSales, 3, 6);
		
		//mapper에서 받을 값
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		pageMap.put("expertIdx", expertIdx);
		
		List<SaleItemExpert> salesList = expertSalesDAO.selectSalesList(pageMap);
		
		
		//컨트롤러에 전달될 map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("salesList", salesList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}

	@Override
	public int getSalesCount() {
		return expertSalesDAO.selectSalesCount();
	}

	@Override
	public int getTotalMoney(int expertIdx) {
		int price =0;
		List<TotalSalesMoney> totalList = expertSalesDAO.selectTotalMoney(expertIdx);
		for(TotalSalesMoney totalSalesList : totalList) {
			price += totalSalesList.getPrice();
		}
		return price;
	}

	@Override
	public int modifySalesStatus(Sales sales) {
		return expertSalesDAO.updateSalesStatus(sales);
	}

	@Override
	public int modifyPurchaseStatus(Sales sales) {
		return expertSalesDAO.updatePurchaseStatus(sales);
	}
	/*
	 * @Override public Sales selectStatus(int salesIdx) { return
	 * expertSalesDAO.selectStatus(salesIdx); }
	 * 
	 */

}