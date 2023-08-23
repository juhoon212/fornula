package com.fornula.domain.expert.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.expertboard.ExpertItemPhoto;
import com.fornula.domain.expert.repository.ExpertInputDAO;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpertInputServiceImpl implements ExpertInputService{
	private final ExpertInputDAO expertInputDAO;
//	전문가 정보 수정시에 사용
	@Override
	public void modifyExpert(Expert expert) {
		expertInputDAO.updateExpert(expert);
	}
//	전문가가 업로드한 게시물을 출력할 때 사용
//	이게 맞나?
	@Override
	public Map<String, Object> getExpertBoardList(int pageNum) {
		int totalBoard=expertInputDAO.selectExpertBoardCount();
		
		Pager pager=new Pager(pageNum, totalBoard, 1, 5);
		
		Map<String, Object> pageMap=new HashMap<String, Object>();
		pageMap.put("startPage", pager.getStartPage());
		pageMap.put("endPage", pager.getEndPage());
		
		List<ExpertItemPhoto> expertItemPhotoList=expertInputDAO.selectexpertBoardList(pageMap);
		
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("expertItemPhotoList", expertItemPhotoList);
		resultMap.put("pager", pager);
		
		return resultMap;
	}
}
