package com.example.board.restcontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BoardRestController {
	@Autowired BoardService boardService;
	
	@GetMapping(value= {"/board/index/{limitPage}"})
	public Map<String, Object> boardList(
			@PathVariable(value="limitPage", required = false) int limitPage){
		
		return boardService.getBoard(limitPage);			
	}
}
