package com.example.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.mapper.BoardMapper;
import com.example.board.vo.Board;

@Service
@Transactional
public class BoardService {
	@Autowired BoardMapper boardMapper;
	
	public void removeBoard(int boardNo) {
		boardMapper.deleteBoard(boardNo);
	}
	
	public void addBoard(Board board) {
		boardMapper.insertBoard(board);
	}
	
	public Map<String, Object> getBoard(int limitPage){
		int lastPage = boardMapper.selectBoardByCount();
		if(lastPage % limitPage == 0) {
			lastPage = lastPage / limitPage;
		} else {
			lastPage = lastPage / limitPage + 1; 
		}
		List<Board> boardList = boardMapper.selectBoard();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("boardList", boardList);
		map.put("lastPage", lastPage);
		
		return map;
	}
}
