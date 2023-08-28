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
//	�쟾臾멸� �젙蹂� �닔�젙�떆 �궗�슜
	@Override
	public void modifyExpert(Expert expert) {
		log.info("ExpertInputServiceImpl �겢�옒�뒪�쓽 modifyExpert()硫붿냼�뱶 �떎�뻾");
		expertInputDAO.updateExpert(expert);
	}
//	�쟾臾멸�媛� �벑濡앺븳 �긽�뭹 寃뚯떆湲��쓣 寃뚯떆�뙋 �삎�깭濡� 異쒕젰�븷 �븣 �궗�슜 -> ExpertOutputService 履쎌쑝濡� 鍮좎쭏�닔�룄 �엳�쓬
//	전문가가 등록한 상품 게시글을 게시판 형태로 출력할 때 사용 -> ExpertOutputService 쪽으로 빠질수도 있음
	/*
>>>>>>> branch 'main' of https://github.com/juhoon212/fornula.git
	@Override
	public Map<String, Object> getExpertBoardList(int pageNum) {
		
		log.info("ExpertInputServiceImpl �겢�옒�뒪�쓽 getExpertBoardList()硫붿냼�뱶 �떎�뻾");
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
	}*/
}
