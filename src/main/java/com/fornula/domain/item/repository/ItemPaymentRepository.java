package com.fornula.domain.item.repository;


import com.fornula.domain.item.dto.ItemPayment;

public interface ItemPaymentRepository {
	
	ItemPayment selectItemPayment(int itemIdx);
}
