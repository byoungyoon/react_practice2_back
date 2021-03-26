package com.example.board.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.service.BoardService;
import com.example.board.vo.Board;

@RestController
public class BoardRestController {
	@Autowired BoardService boardService;
	
	@GetMapping(value= {"/board/index"})
	public List<Board> boardList(){
		return boardService.getBoard();
	}
}
