package com.fornula.domain.expert.service;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.repository.ExpertBoardDAO;
import com.fornula.domain.item.dto.itemdetail.ItemPhotoForExpert;
import com.fornula.domain.util.pager.Pager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExpertBoardServiceImpl implements ExpertBoardService{
	private final ExpertBoardDAO expertBoardDAO;
	
	@Override
	public Map<String, Object> getBoardList(int pageNum, int expertIdx) {
		int totalItem=expertBoardDAO.selectItemCount();
		
		Pager pager=new Pager(pageNum, totalItem, 3, 6);
		
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		pageMap.put("expertIdx", expertIdx);
		
		List<ItemPhotoForExpert> boardList = expertBoardDAO.selectBoardList(pageMap);
		log.info("boardList={}",boardList);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("boardList", boardList);
		resultMap.put("pager", pager);
		
		log.info("resultMap={}", resultMap);	
		return resultMap;
	}
	
	@Override
	public int getItemCount() {
		return expertBoardDAO.selectItemCount();
	}
}
