package com.example.demo.dao;

import com.example.demo.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardDAO {
	List<BoardDTO> getBoardList();
	BoardDTO getBoardDetail(int id);
	int insertBoard(BoardDTO board);
	int updateBoard(BoardDTO board);
	int deleteBoard(int id);
}
