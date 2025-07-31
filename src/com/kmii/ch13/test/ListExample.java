package com.kmii.ch13.test;

import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardDao dao = new BoardDao();
		List<Board> boardList= dao.getBoardDao();
		
		Iterator<Board> iterator = boardList.iterator(); // iterator가 가리킬 껀 누구인가? <board>
		while(iterator.hasNext()) { 
			Board board = iterator.next(); // 추출하고 밑에 객체 전으로 화살표이동
			System.out.println(board.getTitle()+"-"+board.getContent());  //board객체가 private 설정해놔서 바로 board.객체 사용못하고 getter 이용 - getTitle, getContent
		}
		
		
		}
		

	}


