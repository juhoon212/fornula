package com.fornula.domain.item.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.repository.ReviewRepository;
import com.fornula.domain.exception.custom.NotFoundExpertException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.repository.ItemDetailDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemDetailServiceImpl implements ItemDetailService{
	private final ItemDetailDAO itemDetailDAO;
	private final ReviewRepository reviewRepository;
//	상품 상세페이지에서 출력할 하나의 행(상세페이지엔 상품 하나만들어가니까)을 출력하는 용도
	@Override
	public Item getItem(int itemIdx) {
		return itemDetailDAO.selectItem(itemIdx);
	}

	@Override
	public Expert findByMemberIdx(int memerIdx) {
		Expert findExpert = itemDetailDAO.findByMemberIdx(memerIdx);
		
		if(ObjectUtils.isEmpty(findExpert)) {
			throw new NotFoundExpertException("전문가를 찾을 수 없습니다.");
		}
		
		return findExpert;
	}

	@Override
	public Photo selectPhoto(int itemIdx) {
		Photo selectPhoto = itemDetailDAO.selectPhoto(itemIdx);
		return selectPhoto;
	}
	

	
}
