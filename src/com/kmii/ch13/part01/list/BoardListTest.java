package com.kmii.ch13.part01.list;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> boardList = new ArrayList<Board>();  // <>안에 여기에 사용할 객체를 만들어준 class 가져온다
		Date nowDate = new Date(); // 현재 오늘 날짜 시간
		
		//방법1
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubject("안녕하세요");
		board1.setContent("가입인사 드립니다");
		board1.setDate(new Timestamp(nowDate.getTime()));
		
		boardList.add(board1);
		
		//방법2
		boardList.add(new Board("이순신", "안녕하세요", "안녕하세요", new Timestamp(nowDate.getTime())));
		
		//방법3
		Board board2 = new Board("김유신","안녕 김유신", "신라의 장군입니다", new Timestamp(nowDate.getTime()));
		
		boardList.add(board2);	
		
		System.out.println("  제  목   /    글내용    /    글쓴이    /    글쓴날짜   ");
		System.out.println("----------------------------------------------------");
		for (int i=0; i<boardList.size(); i++) {  // length()대신 여기선 size() 사용 
			Board board = boardList.get(i);
			System.out.println(board.getSubject()+" / "+board.getContent()+" / "+board.getWriter()+" / "+board.getDate());
		}
		
		
	}

}
