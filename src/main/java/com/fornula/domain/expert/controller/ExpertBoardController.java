package com.fornula.domain.expert.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertBoardService;
import com.fornula.domain.item.dto.itemdetail.ItemPhotoForExpert;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/expert")
public class ExpertBoardController {
	private final ExpertBoardService expertBoardService;
	private final ItemDetailService itemDetailService;
	
	@GetMapping("/board")
	public String getBoardList(@RequestParam(defaultValue = "1") int pageNum
								,HttpSession session
								,Model model) {
		String originalFileName;
		int pos;
		
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
		int expertIdx = expert.getExpertIdx();
		log.info("expertidx={}",expertIdx);
		
		Map<String, Object> resultMap=expertBoardService.getBoardList(pageNum, expertIdx);
		log.info("list={}", resultMap);
		
		List<ItemPhotoForExpert> resultList=(List<ItemPhotoForExpert>)resultMap.get("boardList");
		log.info("resultList={}",resultList);
		
		for(ItemPhotoForExpert itemBoardList : resultList) {
			
			pos=itemBoardList.getItemfileName().lastIndexOf("_");
			originalFileName=itemBoardList.getItemfileName().substring(pos+1);
			
			itemBoardList.setItemfileName(originalFileName);
		}
		
		log.info("pager={}", resultMap.get("pager"));
		
		model.addAttribute("boardList",resultMap.get("boardList"));
		model.addAttribute("pager", resultMap.get("pager"));
		
		log.info("boardList={}", resultList);
		
		return "expert-list";
	}
}