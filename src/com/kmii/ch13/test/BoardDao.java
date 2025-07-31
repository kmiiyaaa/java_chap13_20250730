package com.kmii.ch13.test;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardDao() {
		List<Board> list = new ArrayList<Board>();    // list - add, get, remove 기억!
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return  list;  // 위에서 나열한걸 박스(?)로만들어 전달~
		
	}

}
