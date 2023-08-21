package com.fornula.domain.item.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.item.repository.ItemBoardDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemBoardServiceImpl implements ItemBoardService{
	private final ItemBoardDAO itemBoardDAO;
	
	@Override
	public Map<String, Object> getItemList(int pageNum) {
		int totalBoard=ItemBoardDAO.selectCount
	}
	
	@Override
	public Map<String, Object> getCategoryItemList(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Map<String, Object> getSearchItemList(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}
}
