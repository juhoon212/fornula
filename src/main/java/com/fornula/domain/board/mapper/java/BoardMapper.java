package com.fornula.domain.board.mapper.java;

import java.util.List;
import java.util.Map;

import com.fornula.domain.board.dto.Board;


public interface BoardMapper {
  int insertBoard(Board board);
  int deleteBoard(int boardIdx);
  int updateBoard(Board board);
  Board selectBoard(int boardIdx);
  int count(Map<String, Object> map);
  int updateCommentCnt(Map<String, Object> map);
  int increaseViewCnt(int boardIdx);
  List<Board> selectBoardList(Map<String, Object> map);
  
  
}
