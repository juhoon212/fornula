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
		int result=itemInsertDAO.insertItem(item);
		return result;
	}
	
//	2.3번 작업을 위한 준비운동(itemIdx 뽑아내기)
	@Override
	public Item getItemIdx(int expertIdx) {
		Item itemNewPhotoIdx=itemInsertDAO.selectItemIdx(expertIdx);
		
		return itemNewPhotoIdx;
	}
	
//	3.임시 photoIdx를 진짜 photoIdx로 변경하기
	@Override
	public int modifyItemPhoto(int itemIdx) {
		
		return itemInsertDAO.updateItemPhoto(itemIdx);
	}
	
//	4.PHOTO 테이블에 전문가가 등록하는 사진에 대한 행 추가
	@Override
	public int addPhoto(Photo photo) {
		int result=itemInsertDAO.insertPhoto(photo); 
		return result;
	}
}
