package com.kmii.ch13.test;

public class MapMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {86,96,92};
		
		//int maxScore = scores[0];
		int maxScore = 0;
		
		for(int score : scores) {
			if(score > maxScore) {
				maxScore = score;  // 조건이 참-> 새로들어온 값이 기존의 maxScore 값보다 크다
			}
		}
		

	}

}
