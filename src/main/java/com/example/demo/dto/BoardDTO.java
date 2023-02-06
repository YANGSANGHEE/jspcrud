package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	private int id;
	private String writer;
	private String title;
	private String con;
	private String date;
}
