package com.fornula.domain.expert.repository;

import java.util.List;
import java.util.Map;
import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.dto.TotalSalesMoney;

public interface ExpertSalesDAO {
	//검색 필터를 이용하여 검색
	//List<ItemSales> selectSearchSalesList(Map<String, Object> map);
	//판매 내역 출력 + 페이징 처리
	List<SaleItemExpert> selectSalesList(Map<String, Object> map);
	int selectSalesCount();
	//상태 버튼 클릭시 판매 상태 변경
	int updateSalesStatus(int salesIdx);
	//총 금액을 출력
	List<TotalSalesMoney> selectTotalMoney(int expertIdx);
}