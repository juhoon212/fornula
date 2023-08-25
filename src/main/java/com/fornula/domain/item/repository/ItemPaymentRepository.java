package com.fornula.domain.item.repository;


import com.fornula.domain.item.dto.Item;

public interface ItemPaymentRepository {
	
	Item selectItemPayment(int itemIdx);
}
