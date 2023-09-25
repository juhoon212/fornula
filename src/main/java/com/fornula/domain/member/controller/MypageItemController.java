package com.fornula.domain.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.Itempurchase;
import com.fornula.domain.member.service.MemberSecurityService;
import com.fornula.domain.member.service.MypageItemService;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageItemController {

   private final MypageItemService itemService;
   private final MemberSecurityService memberSecurityService;
   
   
   @GetMapping("/mypagePurchase")
   public String mypagePurchase(HttpSession session, Model model) {
   
	  CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
      int filePos;
    
      Member member = memberSecurityService.getSecurityMember(loginMember.getId());
      
      List<Itempurchase> itempurchase =itemService.mypageItemPurchase(member.getMemberIdx());
      
      
       for(Itempurchase itempurchasePhoto : itempurchase) {
    	   
    	   
          filePos = itempurchasePhoto.getItemfileName().lastIndexOf("_");
          String originalFileName = itempurchasePhoto.getItemfileName().substring(filePos+1);
          itempurchasePhoto.setItemfileName(originalFileName);
       }
        
       if(itempurchase.isEmpty()) {
    	   model.addAttribute("message", "구매내역이 존재하지 않습니다.");
       }
       
       model.addAttribute("member", member);
       model.addAttribute("Itempurchase", itempurchase);
       
       
      return "mypage-purchase"; 
   }
}