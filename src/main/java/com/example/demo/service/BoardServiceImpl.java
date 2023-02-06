package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardDAO boardDAO;
	
	@Override
	public List<BoardDTO> boardList(){
		return boardDAO.getBoardList();
	}
	//List
	
	@Override
	public BoardDTO boardDetail(int id){
		return boardDAO.getBoardDetail(id);
	}
	//Detail
	
	@Override
	public int boardInsert(BoardDTO board) {
		return boardDAO.insertBoard(board);
	}
	//Write
	
	@Override
	public int boardUpdate(BoardDTO board) {
		return boardDAO.updateBoard(board);
	}
	//Update
	
	@Override
	public int boardDelete(int id) {
		return boardDAO.deleteBoard(id);
	}
	//delete
}
