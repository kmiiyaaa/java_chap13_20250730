package com.kmii.ch13.part02;

import java.util.Stack;


public class StackQuiz02 {
	
	//  (())(() -> 유효한 가로인지 아닌지 출력하는 프로그램을 만드시오 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "))(()";  // 유효하지 않은 상태
		
		Stack<Character> strStack = new Stack<Character>();
		
		for(int i =0; i<str.length() ; i++) {
			char ch = str.charAt(i);  // 문자열에서 한글자씩 추출 , char 타입
			
			if(ch=='(') {
				strStack.push(ch);
			} else {  // ')'
				if(strStack.isEmpty()) {  // 제일 처음 ')'가 들어온 경우
					System.out.println("유효하지 않은 괄호 구성입니다.");
					return;  // break; 쓰면 밑에 if문이 또 출력된다
				}
				strStack.pop();  // 닫는괄호'('가 들어오면 쌓여있던'(' 하나 빼기 = 짝이 추출됨
			}
			
			
		}
		
		if(strStack.isEmpty()) {
			System.out.println("유효한 괄호 구성입니다");
		} else {
			System.out.println("유효하지 않은 괄호 구성입니다.");
		}

	}

}
