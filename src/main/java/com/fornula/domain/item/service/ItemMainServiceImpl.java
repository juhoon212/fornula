package com.fornula.domain.item.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.itemboard.ItemPhotoCategoryCart;
import com.fornula.domain.item.repository.ItemMainRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ItemMainServiceImpl implements ItemMainService{
	private final ItemMainRepository itemMainRepository;

    //메인페이지 상품 출력
	@Override
	public List<ItemPhotoCategoryCart> getMainItemList() {
		return itemMainRepository.mainItemList();
	}
}
