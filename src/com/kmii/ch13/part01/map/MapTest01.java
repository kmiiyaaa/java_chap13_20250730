package com.kmii.ch13.part01.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map1 = new HashMap<String, String>();
		
		
		//map<키,값(value)> - 키값은 중복x , 값은 중복o , key값이랑-value 한쌍, 저장하는 값들에 대한 제목?/이름? 을 지정해놓음
		map1.put("이름", "홍길동");  // put - 데이터삽입
		map1.put("직업", "개발자"); 
		map1.put("성별", "남자");
		map1.put("성별", "여자"); //  키값은 중복이 안된다 : 결론적으로 키값 - 여자로 바뀜
		
		System.out.println(map1.get("이름"));
		System.out.println(map1.get("직업"));
		System.out.println(map1.get("성별"));
		
		
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 80);
		
		map2.put("강감찬", 85); // 강감찬 점수가 80->85로 수정
		
		
		
		
		
		
	}

}

