package com.fornula.domain.board.service;

import java.util.List;
import java.util.Map;

import com.fornula.domain.board.dto.Board;
import com.fornula.domain.board.dto.InquiryBoard;

public interface BoardService {
	//(InquiryBoard VO)게시물 작성
  void write(Board board);
    //게시물 삭제
  void remove(int boardIdx);
    //(InquiryBoard VO)게시물 수정
  void modify(Board board);
    //게시물 한개 출력
  Board selectBoard(int boardIdx);
  
  Map<String, Object> getBoardList(Map<String, Object> map);
  
  
  
	
}
