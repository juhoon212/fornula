package com.fornula.domain.member.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.dto.SaleItemExpert;
import com.fornula.domain.expert.service.ExpertSalesService;
import com.fornula.domain.item.service.ItemDetailService;
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
	private final ExpertSalesService expertSalesService;
    private final ItemDetailService itemDetailService;
   
   
   @GetMapping("/mypagePurchase")
   public String mypagePurchase(@RequestParam(defaultValue = "1") int pageNum,
		                        HttpSession session, Model model) {
   
	  CustomMemberDetails loginMember =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
      int filePos;
    
      Member member = memberSecurityService.getSecurityMember(loginMember.getId());
      
      Map<String, Object> resultMap = itemService.getPurchasesList(pageNum, member.getMemberIdx());
      //List<Itempurchase> itempurchase =itemService.mypageItemPurchase(member.getMemberIdx());
      
    //세션에 있는 expert_idx를 가져오기
		
  	Expert expert = itemDetailService.findByMemberIdx(loginMember.getMemberIdx());
  	int expertIdx = expert.getExpertIdx();
	log.info("expertIdx:{}",expertIdx);//로그출력

	   List<Itempurchase> resultList= (List<Itempurchase>)resultMap.get("itempurchase");
      
       for(Itempurchase itempurchasePhoto : resultList) {
    	   
    	   
          filePos = itempurchasePhoto.getItemfileName().lastIndexOf("_");
          String originalFileName = itempurchasePhoto.getItemfileName().substring(filePos+1);
          itempurchasePhoto.setItemfileName(originalFileName);
       }
        
       if(resultList.isEmpty()) {
    	   model.addAttribute("message", "구매내역이 존재하지 않습니다.");
       }
       
       model.addAttribute("salesList",resultMap.get("salesList"));
       model.addAttribute("pager",resultMap.get("pager")) ;
       model.addAttribute("member", member);
       model.addAttribute("Itempurchase", resultList);
       
       
      return "mypage-purchase"; 
   }
}