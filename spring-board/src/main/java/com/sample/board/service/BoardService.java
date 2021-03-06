package com.sample.board.service;

import java.util.List;

import com.sample.board.vo.Board;
import com.sample.web.pagination.Pagination;

public interface BoardService {

	void addNewBoard(Board board);
	Board getBoardDetail(int boardNo);
	List<Board> getBoards(Pagination pagination);
	int getTotalRows(Pagination pagination);
}
