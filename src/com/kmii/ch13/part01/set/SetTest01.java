package com.kmii.ch13.part01.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new HashSet<String>(); 
		
		set1.add("Kor");
		set1.add("Jap");
		set1.add("China");
		set1.add("USA");
		System.out.println(set1.size()); // set1에 들어간 총 객체 수 : 4 
		
		System.out.println("-------------------------------------");
		
		set1.add("Jap");
		set1.add("China");
		set1.add("Russia");
		System.out.println(set1.size()); // 5 , 앞에 이미 있어서 러시아만 추가해서 객체수 인정  // set - 중복제거!
		
		
		System.out.println("-------------------------------------");
		
		
		//set컬렉션 - 객체검색 : Iterator<> iterator() - 저장된 객체를 한 번씩 가져오는 반복자를 리턴
		
		Iterator<String> iter = set1.iterator();  // set1전용 itertator 생성 , 제일 처음 요소 앞에 위치(?)/ iterator -> 하나씩 꺼내준다
		
		while(iter.hasNext()) {  //hasnext - boolean type, 다음 set 요소(객체)가 있다면 true 
			String str =iter.next();  // set요소를 꺼내고 iterator 이동
			if(set1.equals("Jap")){
				iter.remove();
			}
			System.out.println(str);  // 나오는 순서는 상관없다
			
		}
		
		
		System.out.println("-------------------------------------");
		
		for(String str : set1) { // 향상된 for문 사용
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------");
		
		set1.clear(); // 모든 요소 삭제
		
		for(String str : set1) { // 향상된 for문 사용
			System.out.println(str);
		}
		

		if(set1.isEmpty()) { // true - 이 set안에는 요소가 없음
			System.out.println("비어 있음!");
		}else {
			System.out.println("비어있지 않음!");
		}
		
		
		
		
	}

}
