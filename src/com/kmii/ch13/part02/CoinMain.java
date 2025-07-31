package com.kmii.ch13.part02;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Coin> coinbox  = new Stack<Coin>();
		//coin클래스로 만든 객체만 들어올 수 있는 stack 컬렉션 - coinbox 선언
		
		coinbox.push(new Coin(50));  // 50원 짜리 1개 생성 -> coinbox에 삽입
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();  // 코인박스에서 동전 빼기
			System.out.println("꺼낸 동전 : " + coin.getValue() + "원");  // private선언 - getter 사용
		}
		

	}

}
