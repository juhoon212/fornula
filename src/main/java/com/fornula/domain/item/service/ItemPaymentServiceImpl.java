package com.fornula.domain.item.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.repository.ItemPaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemPaymentServiceImpl implements ItemPaymentService{
	
	private final ItemPaymentRepository itemPaymentRepository;

	@Override
	public Item itemPayment(int memberIdx) {
		// memberIdx 
		return null;
	}
	
	
	

}
