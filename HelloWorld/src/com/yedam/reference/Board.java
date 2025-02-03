package com.yedam.reference;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *게시글 제목, 내용, 작성자, 작성일시 (2025-02-01)
 *
 * 
 * 
 * 
 */
public class Board {

	private String title;
	private String content;
	private String writer;
	private Date writeDate; // ctrl shift o 임폴트!

	// 생성자
	public Board(String title, String content, String writer, Date writeDate) {

		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;

	}

	// getter, setter.
	public void setTitle(String title) {
		this.title = title;

	}

	public String getTitle() {
		return title;

	}

	// showBoard()
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String showBoard() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return title + " " + content + " " + writer + " " + sdf.format(writeDate);

	}

}// end of class
