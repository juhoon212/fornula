package com.fornula.domain.expert.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.item.service.ItemDetailService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/expert")
@Slf4j
public class ExpertInfoController {
    private final ExpertInputService expertInputService;
    private final ItemDetailService itemDetailService;
    private final HttpSession session; // HttpSession 추가

    //전문가 포트폴리오에서 정보 출력
    @GetMapping("/output")
    public String getExpert(@ModelAttribute Expert originalExpert, Model model) {
    	Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
    	Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
    	int expertIdx = expert.getExpertIdx();
    	
    	log.info("Expert Info: expertIdx={}, phone={}, interest={}, career={}, companyOne={}, companyTwo={}, companyThree={}, introduce={}",
    			expert.getExpertIdx(), expert.getPhone(), expert.getInterest(), expert.getCareer(),
    			expert.getCompanyOne(), expert.getCompanyTwo(), expert.getCompanyThree(), expert.getIntroduce());
    	
//      기존 전문가 정보 조회
    	originalExpert = expertInputService.getOriginalExpert(expertIdx);
    	model.addAttribute("loginMember", loginMember);
    	model.addAttribute("originalExpert", originalExpert);
    	
    	log.info("Showing modify form for memberIdx: {}",loginMember.getMemberIdx());
    	log.info("Showing modify form for expertIdx: {}", expertIdx);
    	log.info("Showing modify form for originalExpert: {}", originalExpert);
    	
    	return "expert-output"; 
    }
    
    @GetMapping("/input")
    public String getOriginalExpert(@ModelAttribute Expert originalExpert, Model model) {
        Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
        Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
        int expertIdx = expert.getExpertIdx();
        
        log.info("Expert Info: expertIdx={}, phone={}, interest={}, career={}, companyOne={}, companyTwo={}, companyThree={}, introduce={}",
                expert.getExpertIdx(), expert.getPhone(), expert.getInterest(), expert.getCareer(),
                expert.getCompanyOne(), expert.getCompanyTwo(), expert.getCompanyThree(), expert.getIntroduce());
        
//      기존 전문가 정보 조회
        originalExpert = expertInputService.getOriginalExpert(expertIdx);
        model.addAttribute("loginMember", loginMember);
        model.addAttribute("originalExpert", originalExpert);
        
        log.info("Showing modify form for expertIdx: {}", expertIdx);
        log.info("Showing modify form for originalExpert: {}", originalExpert);
        
        return "expert-input"; 
    }
    

    @PostMapping("/input")
    public String modifyExpert(@ModelAttribute Expert expert, Model model) {
        log.info("Modifying expert information for expertIdx: {}", expert.getExpertIdx());
        expertInputService.modifyExpert(expert);
        model.addAttribute("message", "전문가 수정을 완료하였습니다.");
                
        return "expertupdate-success";
    }
}


