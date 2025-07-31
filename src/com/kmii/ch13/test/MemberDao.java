package com.kmii.ch13.test;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	public List<MemberDto> getBoardList() {
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		list.add(new MemberDto("tiger", "12345","홍길동","tiger@abc.com"));
		list.add(new MemberDto("lion", "54321","이순신","lion@abc.com"));
		list.add(new MemberDto("blackCat", "88888","김유신","blackcat@abc.com"));
		list.add(new MemberDto("whiteDog", "99999","강감찬","whitedog@abc.com"));
		
		return list;
		
	}

}
