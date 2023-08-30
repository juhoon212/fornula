package com.fornula.domain.item.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.ItemPayment;
import com.fornula.domain.item.repository.ItemPaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemPaymentServiceImpl implements ItemPaymentService{
	
	private final ItemPaymentRepository itemPaymentRepository;

	@Override
	public ItemPayment itemPayment(int itemIdx) {
		ItemPayment itemPayment =itemPaymentRepository.selectItemPayment(itemIdx);
		return itemPayment;
	}
	
	
	

}
