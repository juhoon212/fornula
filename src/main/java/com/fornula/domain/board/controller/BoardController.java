package com.fornula.domain.board.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.board.dto.Board;
import com.fornula.domain.board.dto.InquiryBoard;
import com.fornula.domain.board.service.BoardService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.util.security.CustomMemberDetails;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

   private final BoardService boardService;
   
   //게시물 쓰기
   @GetMapping("/write")
   public String writeBoard(Model model) {
      //모드 new 값 넣기
      model.addAttribute("mode", "new");
      
      return "board";
   }
   
   @PostMapping("/write")
   public String writeBoard(@ModelAttribute InquiryBoard inquiryBoard
                          ,HttpSession session
                          ,Model model) {
      
       //현제 세션에 있는 ID값 받아오기 위한 MEMBER 객체 저장
	   CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
      
      //VO 클래스를 DTO에 값 넣기
      Board board = new Board();
      board.setId(member.getId());
      board.setBoardContent(inquiryBoard.getBoardContent());
      board.setBoardFileName(inquiryBoard.getBoardFileName());
      board.setBoardTitle(inquiryBoard.getBoardTitle());
      
      model.addAttribute("mode", "new");
      
      //서비스 write메소드 실행
      boardService.write(board);
      
      return "redirect:/board/list";
   }
   
   /*게시물 출력
   @GetMapping("/read") 
   public String boardOne(Model model
                        ,@RequestParam Integer boardIdx
                        ,HttpSession session
                        ,@RequestParam Integer pageSize) {
      //현제 세션에 있는 ID값 받아오기 위한 MEMBER 객체 저장
      Member member=(Member)session.getAttribute(SessionConst.Login_Member);
      
      log.info("member = {}", member);
      //서비스 selectBoard메소드로 board 객체 저장
      Board board=boardService.selectBoard(boardIdx);
      
      log.info("board = {}", board);
      //jsp에서 보여주기 위해 모델에 member,board 추가
      model.addAttribute("member", member);
      model.addAttribute("board", board);
      model.addAttribute("pageSize", pageSize);
      
      return "board";
   }
   */
   @RequestMapping("/read")
   public String detail(@RequestParam Map<String, Object> map, Model model,HttpSession session) {
      int idx=Integer.parseInt((String)map.get("boardIdx"));
      Board board=boardService.selectBoard(idx);
      //model.addAttribute("securityBoard", board);
      CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);
      model.addAttribute("search", map);
      model.addAttribute("member", member);
      model.addAttribute("board", board);
      return "board";
   }
   
   //게시물 삭제
   @PostMapping("/remove")
   public String remove(@RequestParam Integer boardIdx
                      ,HttpSession session
                      ,RedirectAttributes redirectAttributes) {
      //로그인 중인 작성자 아이디
      // String writer = (String)session.getAttribute(SessionConst.Login_Member);
      //String message="DEL_OK";
      log.info("writer = {}", boardIdx);
      boardService.remove(boardIdx);
      
      //redirectAttributes.addAttribute("pageNum", pageNum);
      //redirectAttributes.addAttribute("pageSize", pageSize);
      //redirectAttributes.addFlashAttribute("message", message);
      
      return "redirect:/board/list";
   }
   
   //게시물 수정
   
   @PostMapping("/modify")
   public String modify(@RequestParam Integer boardIdx
                      ,@ModelAttribute InquiryBoard inquiryBoard
                      ,Model model
                      ,HttpSession session) {
	   CustomMemberDetails member =  (CustomMemberDetails) session.getAttribute(SessionConst.Login_Member);                            
    Board board= new Board();
    board.setBoardTitle(inquiryBoard.getBoardTitle());
    board.setId(member.getId());
    board.setBoardContent(inquiryBoard.getBoardContent());
    board.setBoardFileName(inquiryBoard.getBoardFileName());
      
    boardService.modify(board);
    
   
    model.addAttribute("board", board);
    
      return "board";
   }
   
   @RequestMapping("/list")
   public String list(@RequestParam Map<String, Object> map, Model model) {
       model.addAttribute("result", boardService.getBoardList(map));
       model.addAttribute("search", map);
       return "list";
   }

   
}