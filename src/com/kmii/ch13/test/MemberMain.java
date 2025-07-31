package com.kmii.ch13.test;

import java.util.Iterator;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDao memberDao = new MemberDao();
		List<MemberDto> list= memberDao.getBoardList();
		
		
		Iterator<MemberDto> iterator = list.iterator();
		while (iterator.hasNext()) {
			
			MemberDto mem = iterator.next();
			System.out.println(mem.getId() + "/" + mem.getPw() + "/" + mem.getName() + "/" + mem.getEmail());
			
		}
		
		/*
		List<MemberDto> list = memberDao.getBoardList();

		for (MemberDto mem : list) {
    	System.out.println(mem.getId() + "/" + mem.getPw() + "/" + mem.getName() + "/" + mem.getEmail());
		}

		 
		*/
		
	}

}
