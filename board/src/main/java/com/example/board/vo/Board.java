package com.example.board.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String boardCount;
	private Date createDate;
	private Date lastUpdate;
}
