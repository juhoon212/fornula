package com.fornula.domain.item.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.repository.ItemDetailDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemDetailServiceImpl implements ItemDetailService{
	private final ItemDetailDAO itemDetailDAO;
	
	@Override
	public void getItem(ItemPhoto itemPhoto) {
		itemDetailDAO.selectItem(itemPhoto);
	}
	
	@Override
	public void getItemExpert(ExpertMember expertMember) {
		itemDetailDAO.selectItemExpert(expertMember);
	}
}
