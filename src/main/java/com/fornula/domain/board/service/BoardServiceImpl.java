package com.fornula.domain.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fornula.domain.board.dto.Board;
import com.fornula.domain.board.dto.InquiryBoard;
import com.fornula.domain.board.repository.BoardRepository;
import com.fornula.domain.util.pager.Pager;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

	private final BoardRepository boardRepository;

	@Override
	public void write(Board board) {
		int num=boardRepository.insertBoard(board);
		
	}

	@Override
	public void remove(int boardIdx) {
		boardRepository.deleteBoard(boardIdx);
		
	}

	@Override
	public void modify(Board board) {
		boardRepository.insertBoard(board);
		
	}

	@Override
	public Board selectBoard(int boardIdx) {
		Board board=boardRepository.selectBoard(boardIdx);
		return board;
	}

	@Override
	public Map<String, Object> getBoardList(Map<String, Object> map) {
		int pageNum=1;
		if(map.get("pageNum") != null && !map.get("pageNum").equals("")) {
			pageNum=Integer.parseInt((String)map.get("pageNum"));
		}
		int pageSize=5;
		int totalBoard=boardRepository.count(map);
		int blockSize=5;
		
		Pager pager=new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		map.put("startRow", pager.getStartRow());
		map.put("endRow", pager.getEndRow());
		List<Board> boardList=boardRepository.selectBoardList(map);
		
		Map<String, Object> result=new HashMap<String, Object>();
		result.put("pager", pager);
		result.put("boardList", boardList);
		
		return result;
	}

	
	
	
}
