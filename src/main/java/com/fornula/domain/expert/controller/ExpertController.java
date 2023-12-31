package com.fornula.domain.expert.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
@RequiredArgsConstructor
public class ExpertController{
	
	private final ItemDetailService itemDetailService;
	
	/*
	 * //전문가 마이페이지(판매관리)
	 * 
	 * @RequestMapping(value = "/mypage") public String mypage() {
	 * log.info("ExpertController 클래스의 mypage() 메소드 실행"); return "expert-main"; }
	 */

	/*
	 * //전문가 정보수정 페이지
	 * 
	 * @GetMapping(value = "/expert/input") public String input() {
	 * log.info("ExpertController 클래스의 input() 메소드 실행"); return "expert-input"; }
	 * 
	 */
	// 전문가 페이지에서 상품 등록 페이지 클릭하면 session에서 로그인멤버의 전문가 번호를 찾아서 반환
	@GetMapping("/expert/item")
	public String expertItem(HttpSession session, Model model, RedirectAttributes redirectAttributes) {
			
		CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
		Expert findExpert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx()); // MemberIdx 로 찾은 전문가
			
		model.addAttribute("expertIdx", findExpert.getExpertIdx());
			
		return"expert-item";
	}
		
	@GetMapping("/expert/item/{expertIdx}")
	public String expertItem(@PathVariable Integer expertIdx, Model model) {
		
		model.addAttribute("expertIdx", expertIdx);
			
		return"item-add/{expertIdx}";
	}
	

	/*
	 * // 포트폴리오로 이동하는 메소드
	 * 
	 * @RequestMapping(value = "/expertoutput") public String output() {
	 * log.info("ExpertController 클래스의 mypage() 메소드 실행"); return "expert-output"; }
	 */
//	상품등록시 주의사항으로 넘어가는 메소드
	@RequestMapping(value = "/expertitem")
	public String item() {
		log.info("ExpertController 클래스의 mypage() 메소드 실행");
		return "expert-item";
	}
	
	@GetMapping(value = "/parkhayun")
	public String test() {
	    log.info("ExpertController 클래스의 test() 메소드 실행");
	    return "redirect:/resources/images/phy.pdf";
	}
}