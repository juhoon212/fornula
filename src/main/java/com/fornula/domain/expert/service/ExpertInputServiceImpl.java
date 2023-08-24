package com.fornula.domain.expert.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.item.dto.Item;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExpertInputServiceImpl implements ExpertInputService{
	private final ExpertInputDAO expertInputDAO;
//	전문가 정보 수정시 사용
	@Override
	public void modifyExpert(Expert expert) {
		log.info("ExpertInputServiceImpl 클래스의 modifyExpert()메소드 실행");
		expertInputDAO.updateExpert(expert);
	}
//	전문가가 등록한 상품 게시글을 게시판 형태로 출력할 때 사용 -> ExpertOutputService 쪽으로 빠질수도 있음
	@Override
	public Map<String, Object> getExpertBoardList(int pageNum) {
		
		log.info("ExpertInputServiceImpl 클래스의 getExpertBoardList()메소드 실행");
		int totalBoard=expertInputDAO.selectExpertBoardCount();
		
		Pager pager=new Pager(1, totalBoard, 3, 3);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startRow", pager.getStartRow());
		pageMap.put("endRow", pager.getEndRow());
		
		List<Item> itemList=expertInputDAO.selectExpertItemList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("itemList", itemList);
		resultMap.put("pager", pager);

		return resultMap;
	}
// 전문가 등록시에 사용	
	@Override
	public void addExpert(Expert expert) {
		log.info("ExpertInputServiceImpl 클래스의 addExpert()메소드 실행");
		expertInputDAO.insertExpertInfo(expert);
	}
}
