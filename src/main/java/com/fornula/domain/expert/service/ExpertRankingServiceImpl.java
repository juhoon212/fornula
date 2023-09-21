package com.fornula.domain.expert.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.TotalSalesMoney;
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
		List<Expert> expertBoardList=expertRankingDAO.selectExpertList(pageMap);
		log.info("pageMap", pageMap);
		log.info("expertBoardList={}",expertBoardList);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("pager", pager);
		resultMap.put("expertBoardList", expertBoardList);
		log.info("resultMap={}", resultMap);
		
		return resultMap;
	}
//	총 전문가가 몇명 있는지 출력용 메소드
	@Override
	public int getExpertCount() {
		return expertRankingDAO.selectExpertCount();
	}
//	전문가 한명당 총 판매 금액 출력하는 메소드
	@Override
	public Map<String, Object> getExpertRanking(int pageNum) {
		int totalBoard=expertRankingDAO.selectExpertCount();
		int pageSize=6;
		int blockSize=5;
		
		Pager pager = new Pager(pageNum,totalBoard, pageSize, blockSize);
		
		Map<String, Object> pageMap = new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		
		List<Expert> expertRankingList=expertRankingDAO.selectExpertList(pageMap);
		log.info("pageMap", pageMap);
		log.info("expertBoardList={}",expertRankingList);
		
		
		int price =0;
		List<TotalSalesMoney> totalList = expertRankingDAO.selectTotalMoney(pageMap);
		for(TotalSalesMoney totalSalesList : totalList) {
			price += totalSalesList.getPrice();
		}
		Map<String, Object> resultPrice=new HashMap<String, Object>();
		resultPrice.put("pager", pager);
		resultPrice.put("expertRankingList", expertRankingList);
		resultPrice.put("resultPrice", resultPrice);
		
		return resultPrice;
	}
}