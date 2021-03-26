package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.mapper.BoardMapper;
import com.example.board.vo.Board;

@Service
@Transactional
public class BoardService {
	@Autowired BoardMapper boardMapper;
	
	public List<Board> getBoard(){
		return boardMapper.selectBoard();
	}
}
