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
public class ExpertInputController {
    private final ExpertInputService expertInputService;
    private final ItemDetailService itemDetailService;
    private final HttpSession session; // HttpSession 추가

    @GetMapping("/readModify")
    public String getOriginalExpert(Model model) {
        Member loginMember = (Member) session.getAttribute(SessionConst.Login_Member);
        
        // Expert 객체로 expertIdx 가져오기
        Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
        int expertIdx = expert.getExpertIdx();
        
        // 기존 전문가 정보 조회
        Expert originalExpert = expertInputService.getOriginalExpert(expertIdx);

        model.addAttribute("loginMember", loginMember);
        model.addAttribute("originalExpert", originalExpert);

        log.info("Showing modify form for expertIdx: {}", expertIdx);

        return "expert/modify"; 
    }

    @PostMapping("/modify")
    public String modifyExpert(@ModelAttribute Expert modifiedExpert) {
        log.info("Modifying expert information for expertIdx: {}", modifiedExpert.getExpertIdx());

        expertInputService.modifyExpert(modifiedExpert);

        return "redirect:/expert/modify";
    }
}
