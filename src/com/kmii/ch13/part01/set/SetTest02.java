package com.kmii.ch13.part01.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<MemberDto> set = new HashSet<MemberDto>();
		
		MemberDto member1 = new MemberDto("아이디","12345","이름",20);
		
		set.add(member1);
		set.add(member1);
		set.add(member1);
		set.add(member1);
		
		System.out.println(set.size()); // 1 , 중복허용 하지 않아서 여러개 나열했어도 1로 인정

	}

}
