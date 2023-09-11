package com.fornula.domain.item.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.Photo;
import com.fornula.domain.item.repository.ItemInsertDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemInsertServiceImpl implements ItemInsertService{
	private final ItemInsertDAO itemInsertDAO;
	
//	1.상품등록(임시 photoIdx 부여)
	@Override
	public int addItem(Item item) {
		return itemInsertDAO.insertItem(item);
	}
	
//	2.3번 작업을 위한 준비운동(itemIdx 뽑아내기)
	@Override
	public Item getItemIdx(int expertIdx) {
		Item itemNewPhotoIdx=itemInsertDAO.selectItemIdx(expertIdx);
		
		return itemNewPhotoIdx;
	}
	
//	4.PHOTO 테이블에 전문가가 등록하는 사진에 대한 행 추가
	@Override
	public int addPhoto(Photo photo) {
		return itemInsertDAO.insertPhoto(photo); 
	}
}
