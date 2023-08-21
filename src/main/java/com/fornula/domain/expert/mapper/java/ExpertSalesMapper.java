package com.fornula.domain.expert.mapper.java;

import com.fornula.domain.expert.dto.Sales;

public interface ExpertSalesMapper {
	Sales selectSearch(int salesStatus, String salesDate);
}
