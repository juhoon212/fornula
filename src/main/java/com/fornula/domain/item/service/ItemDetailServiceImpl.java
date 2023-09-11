package com.fornula.domain.item.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fornula.domain.board.dto.Reviews;
import com.fornula.domain.board.repository.ReviewRepository;
import com.fornula.domain.exception.custom.ItemNotFoundException;
import com.fornula.domain.exception.custom.NotFoundExpertException;
import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.dto.itemdetail.ExpertMember;
import com.fornula.domain.item.dto.itemdetail.ItemPhoto;
import com.fornula.domain.item.repository.ItemDetailDAO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
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

	@Override
	public int updateItem(Item item) {
		
		if(item == null || item.getCategoryIdx() == 0) {
			throw new ItemNotFoundException("아이템을 찾을 수 없습니다.");
		}

		int result = itemDetailDAO.updateItem(item);
		
		if(result == 0) {
			throw new ItemNotFoundException("아이템을 찾을 수 없습니다.");
		}
		
		return result;
	}

	@Override
	public Item findItemByIdx(int itemIdx) {
		
		Item findItem = itemDetailDAO.findItemByIdx(itemIdx);
		
		// 실패 로직
		if(findItem == null) {
			throw new ItemNotFoundException("아이템을 찾을 수 없습니다.");
		}
		
		//성공 로직
		
		log.info("찾은 아이템 IDX = {}", findItem.getItemIdx());
		
		return findItem;
	}

	@Override
	public int updatePhoto(Photo photo) {
		
		int result = itemDetailDAO.updatePhoto(photo);
		
		log.info("updatePhoto = {}", photo.getItemfileName());
		
		if(result == 0) {
			throw new ItemNotFoundException("사진이 없습니다");
		}
		
		return result;
	}

	@Override
	public Photo findByItemIdx(int itemIdx) {
		
		Photo findPhoto = itemDetailDAO.findByItemIdx(itemIdx);
		
		if(findPhoto == null) {
			throw new ItemNotFoundException("아이템에 해당하는 사진을 찾을 수 없습니다.");
		}
		
		return findPhoto;
	}
	
	
	

	
}
