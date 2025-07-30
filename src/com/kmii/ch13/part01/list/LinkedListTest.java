package com.kmii.ch13.part01.list;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new LinkedList<Board>();
		
		Date nowDate = new Date();
		
		Board board = new Board("강감찬", "안녕하세요", "첫 글입니다", new Timestamp(nowDate.getTime()));
		
		long start;  // 시간은 long 써준다
		long end;
		
		
		
		//arraylist 작업
		start= System.nanoTime();
		for(int i =0; i<1000000;i++) {
			list1.add(board);	
		}
		end = System.nanoTime();
		System.out.println("ArrayList 작업시간 : " + (end - start));
		
		
		
		
		//linkedlist 작업 - 더빠르다
		start= System.nanoTime();
		for(int i =0; i<1000000;i++) {
			list2.add(board);			
		}
		end = System.nanoTime();
		System.out.println("LinkedtList 작업시간 : " + (end - start));
		
		

	}

}
