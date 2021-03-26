package com.example.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.vo.Board;

@Mapper
public interface BoardMapper {
	List<Board> selectBoard();
}
