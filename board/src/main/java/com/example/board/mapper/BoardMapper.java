package com.example.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.vo.Board;

@Mapper
public interface BoardMapper {
	int deleteBoard(int boardNo);
	int insertBoard(Board board);
	int selectBoardByCount();
	List<Board> selectBoard();
}
