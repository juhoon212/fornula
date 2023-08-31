package com.fornula.domain.expert.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fornula.domain.expert.dto.ItemSales;
import com.fornula.domain.expert.dto.SaleItemExpert;

public interface ExpertSalesDAO {
	//검색 필터를 이용하여 검색
	List<ItemSales> selectSearchSalesList(@Param("salesStatus") int salesStatus, @Param("salesDate") String salesDate);
	//판매 내역 출력
	List<SaleItemExpert> selectSalesList(int expertIdx);
	//상태 버튼 클릭시 판매 상태 변경
	int updateSalesStatus(int salesIdx);
	//세션의 memberIdx를 통해 expertIdx 를 가져오는 DAo
	int selectExpertIdxByMemberIdx(int memberIdx);

}
