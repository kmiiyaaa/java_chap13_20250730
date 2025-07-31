package com.kmii.ch13.part02;

import java.util.Stack;

public class StackQuiz01 {
	
	//문자열 뒤집기 : Hello 문자열을 거꾸로 출력하시오. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> char1 = new Stack<Character>();
		
		char1.push('H');
		char1.push('e');
		char1.push('l');
		char1.push('l');
		char1.push('o');
		
		while(!char1.isEmpty()) {
			Character char2 = char1.pop();
			System.out.println(char2);
		}
		
		
	// String str = "Hello";
		
	// Stack<Character> strStack = new Stack<Character>();  // 문자열 hello가 한글자씩 추출해서 character
		
	// for (int i=0;i<str.length();i++){
	//	char ch = str.charAt(i);   // 문자열에서 한글자씩 추출 : char 타입
	// 	strStack.push(ch);
	// 	}	
	
	//  while(!char1.isEmpty()) {
	//	System.out.println(strStack.pop());
	//  }	
		

	}

}
