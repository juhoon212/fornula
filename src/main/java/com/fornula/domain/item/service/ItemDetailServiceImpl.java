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
//	상품 상세페이지에서 출력할 하나의 행(상세페이지엔 상품 하나만들어가니까)을 출력하는 용도
	@Override
	public ItemPhoto getItem(int itemIdx) {
		return itemDetailDAO.selectItem(itemIdx);
	}
//	상품 상세페이지에서 출력하는 전문가(판매자)의 전화번호, id 등을 출력하기 위한 용도
	@Override
	public ExpertMember getItemExpert(int expertIdx) {
		return itemDetailDAO.selectItemExpert(expertIdx);
	}
}
