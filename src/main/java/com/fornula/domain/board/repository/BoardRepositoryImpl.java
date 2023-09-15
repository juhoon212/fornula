package com.fornula.domain.board.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fornula.domain.board.dto.Board;
import com.fornula.domain.board.mapper.java.BoardMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardRepositoryImpl implements BoardRepository{

	private final SqlSession session;
	
	@Override
	public int insertBoard(Board board) {
		
		return session.getMapper(BoardMapper.class).insertBoard(board);
	}

	@Override
	public int deleteBoard(int boardIdx) {
		
		return session.getMapper(BoardMapper.class).deleteBoard(boardIdx);
	}

	@Override
	public int updateBoard(Board board) {
		
		return session.getMapper(BoardMapper.class).updateBoard(board);
	}

	@Override
	public Board selectBoard(int boardIdx) {
		
		return session.getMapper(BoardMapper.class).selectBoard(boardIdx);
	}

	@Override
	public int count(Map<String, Object> map) {
		
		return session.getMapper(BoardMapper.class).count(map);
	}

	@Override
	public int updateCommentCnt(Map<String, Object> map) {
		
		return session.getMapper(BoardMapper.class).updateCommentCnt(map);
	}

	@Override
	public int increaseViewCnt(int boardIdx) {
		
		return session.getMapper(BoardMapper.class).increaseViewCnt(boardIdx);
	}

	@Override
	public List<Board> selectBoardList(Map<String, Object> map) {
		
		return session.getMapper(BoardMapper.class).selectBoardList(map);
	}

}
