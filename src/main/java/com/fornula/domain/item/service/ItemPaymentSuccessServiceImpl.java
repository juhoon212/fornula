package com.fornula.domain.item.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.repository.ItemPaymentRepository;
import com.fornula.domain.item.repository.ItemPaymentSuccessRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemPaymentSuccessServiceImpl implements ItemPaymentSuccessService{
	
	private final ItemPaymentSuccessRepository itemPaymentSuccessRepository;

	@Override
	public Item itemPayment(int memberIdx) {
		// memberIdx 
		return null;
	}
	
	
	

}
