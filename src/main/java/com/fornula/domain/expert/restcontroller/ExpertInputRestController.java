package com.fornula.domain.expert.restcontroller;
/*

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.service.ExpertInputService;
import com.fornula.domain.item.dto.Category;
import com.fornula.domain.item.service.ItemDetailService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ExpertInputRestController{
   private final ExpertInputService expertInputService;
   private final ItemDetailService itemDetailService;
   //  전문가 정보 수정시에 사용할 메소드
//   ResponseEntity를 사용하여 클라이언트에게 응답 데이터랑 상태코드, 헤더 등을 포함하여 응답을 구성할 수 있게 해준다고함
    @PutMapping("/modify")
    public ResponseEntity<String> expertModify(@RequestBody Expert expert) {
        
        expertInputService.modifyExpert(expert);

        log.info("ExpertInputRestController 클래스의 expertModify() 메소드 실행");
        return ResponseEntity.ok("수정 성공");
    }
    
//  세션에서 전문가의 expertIdx 뽑아오기
    @GetMapping("/getExpertIdx")
    @ResponseBody
    public int getLoggedInExpertIdx(HttpSession session) {
    		Member member = (Member)session.getAttribute(SessionConst.Login_Member);
    		log.info("getExpertIdx: {}", member.getMemberIdx());
    		Expert findExpertIdx = itemDetailService.findByMemberIdx(member.getMemberIdx());
            return findExpertIdx.getExpertIdx();
    }
    
//  전문가가 수정하기 이전의 카테고리가 무엇인지 출력해주기
    @GetMapping("/getExpertCategory")
    @ResponseBody
    public ResponseEntity<Category> getExpertCategory(HttpSession session) {
        int expertIdx = getLoggedInExpertIdx(session);
        Category category = expertInputService.getExpertOriginalCategory(expertIdx);
        return ResponseEntity.ok(category);
    }
    언젠가 다시 쓰겟지...
}*/ 