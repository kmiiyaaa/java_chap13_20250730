package java_ch13_20250730;

import java.sql.Timestamp;

//DTO 클래스 (VO 클래스)
// 글 한개를 저장하는 객체 - 글 한개 (글쓴이, 글제목, 글내용, 글쓴날짜)

public class Board {
	
	private String writer ; 
	private String subject;
	private String content ;
	private Timestamp date;
	
	//생성자 2, getter, setter 
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Board(String writer, String subject, String content, Timestamp date) {
		super();
		this.writer = writer;
		this.subject = subject;
		this.content = content;
		this.date = date;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
	
	
	

}
