package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dto.BoardDTO;

import com.example.demo.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	private final BoardService boardService;
	
	@RequestMapping("/")
	public String boardMain(Model model) throws Exception {
		model.addAttribute("list", boardService.boardList());
		System.out.println(boardService.boardList());
		
		return "index";
	}
	//List 
	
	@RequestMapping("/boardetail/{id}")
	public String boardDetail(@PathVariable int id, Model model) throws Exception{
		//PathVariable : REST API에서 URL 변수가 들어가는 부분을 처리해주는 부분
		// ex) http://localhost:8080/boardDetail/1(id)
		
		model.addAttribute("detail", boardService.boardDetail(id));
		System.out.println(boardService.boardDetail(id));
		
		return "boardDetail";
	}
	//Detail
	
	@RequestMapping("/boardwrite")
	public String boardWrite() throws Exception{
		return "boardWrite";
	}
	//Writepage
	
	@RequestMapping("/boardwriteinsert")
	public String boardWriteInsert(HttpServletRequest req) throws Exception{
//		BoardDTO borad = (BoardDTO) req.getParameterMap();
//		
//		return boardService.boardInsert(borad);
		
		BoardDTO board = new BoardDTO();
		//인스턴스 생성
		
		board.setWriter(req.getParameter("writer"));
		board.setTitle(req.getParameter("title"));
		board.setCon(req.getParameter("contents"));
		board.setDate(req.getParameter("date"));
		
//		System.out.println(req.getParameter("writer"));
		
		boardService.boardInsert(board);
		
		return "redirect:/";
	}
//	//WritePost
//	
	@RequestMapping("/boardupdate/{id}")
	public String boardUpdate(@PathVariable int id, Model model) throws Exception{
		model.addAttribute("update",boardService.boardDetail(id));
		
		return "boardUpdate";
	}
	//UpdatePage
	
	@RequestMapping("/boardupdateproc")
	public String boardUpdateProc(HttpServletRequest req) throws Exception{
		BoardDTO board = new BoardDTO();
		//인스턴스 생성
		board.setWriter(req.getParameter("writer"));
		board.setTitle(req.getParameter("title"));
		board.setCon(req.getParameter("contents"));
		board.setDate(req.getParameter("date"));
		board.setId(Integer.parseInt(req.getParameter("id")));
		
		boardService.boardUpdate(board);
		
		return "redirect:/boardetail/" + req.getParameter("id");
	}
	//UpdateProc
	
	@RequestMapping("boarddelete/{id}")
	public String boardDelete(@PathVariable int id, Model model) throws Exception{
		boardService.boardDelete(id);
		
		return "redirect:/";
	}
}
