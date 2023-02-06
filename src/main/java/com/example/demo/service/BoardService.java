package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import java.util.List;

public interface BoardService {
	List<BoardDTO> boardList();
	BoardDTO boardDetail(int id);
	int boardInsert(BoardDTO board);
	int boardUpdate(BoardDTO board);
	int boardDelete(int id);
}
