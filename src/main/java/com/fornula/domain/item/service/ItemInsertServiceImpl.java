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
	
	@Override
	public void addItem(Item item) {
		itemInsertDAO.insertItem(item);
	}
	/*
	@Override
	public void addPhoto(Photo photo) {
		itemInsertDAO.insertPhoto(photo);	
	}
	*/
}
