package com.fornula.domain.expert.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.vo.ExpertMoneyRanking;
import com.fornula.domain.expert.repository.ExpertRankingDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExpertRankingServiceImpl implements ExpertRankingService{
	private final ExpertRankingDAO expertRankingDAO;
//	전문가 리스트 뽑는 메소드
	@Override
	public Map<String, Object> getExpertList(int pageNum) {
		int totalBoard=expertRankingDAO.selectExpertCount();
		int pageSize=6;
		int blockSize=5;
		
		Pager pager = new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		List<ExpertMoneyRanking> expertBoardList=expertRankingDAO.selectExpertList(pageMap);
//		log.info("pageMap", pageMap);
//		log.info("expertBoardList={}",expertBoardList);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("expertBoardList", expertBoardList);
//		log.info("resultMap={}", resultMap);
		
		return resultMap;
	}
//	총 전문가가 몇명 있는지 출력용 메소드
	@Override
	public int getExpertCount() {
		return expertRankingDAO.selectExpertCount();
	}
//	총판매액 순서로 출력하는 전문가 리스트를 뽑는 메소드
	@Override
	public Map<String, Object> getMoneyList(int pageNum) {
		int totalBoard=expertRankingDAO.selectExpertCount();
		int pageSize=6;
		int blockSize=5;
		
		Pager pager = new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		List<ExpertMoneyRanking> expertMoneyList=expertRankingDAO.selectTotalMoneyList(pageMap);
		log.info("pageMap", pageMap);
		log.info("expertMoneyList={}",expertMoneyList);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("expertMoneyList", expertMoneyList);
		log.info("resultMap={}", resultMap);
		
		return resultMap;
	}
	/*
//	총판매액 순서로 출력하는 전문가 리스트를 뽑는 메소드를 위하여 몇명 있는지 출력용 메소드	
	@Override
	public int getMoneyCount() {
		return expertRankingDAO.selectMoneyCount();
	}
	*/
}