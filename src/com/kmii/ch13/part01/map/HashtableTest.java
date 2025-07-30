package com.kmii.ch13.part01.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("tiger", "12345");   // id,pw
		map.put("lion", "54321");
		map.put("dog", "00000");
		map.put("cat", "99999");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { 
			System.out.println("아이디 : " );
			String id = scanner.nextLine();	
			
			System.out.println("비밀번호 : " );
			String pw = scanner.nextLine();	
			
			System.out.println("-------------");
			
			if(map.containsKey(id)) {    // containskey - key값을 중에 일치여부 확인 메서드
				// map에 있는 key값들 중에 id값과 일치하는 값이 존재하면 true 반환
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					break;
				} else {  // id값은 존재하나 해당 id의 비밀번호가 틀림
					System.out.println("비밀번호를 잘못 입력하였습니다.");
				}
				
				
			} else {
				System.out.println("입력하신 ID가 존재하지 않습니다.");
			}
			
			
			
		}

	}

}
