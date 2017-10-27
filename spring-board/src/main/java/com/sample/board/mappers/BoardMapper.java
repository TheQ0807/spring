package com.sample.board.mappers;

import java.util.List;

import com.sample.board.vo.Board;
import com.sample.web.pagination.Pagination;

public interface BoardMapper {

	void addBoard(Board board);
	Board getBoard(int boardNo);
	
	List<Board> getBoards(Pagination pagination);
	int getTotalRows(Pagination pagination);
}
