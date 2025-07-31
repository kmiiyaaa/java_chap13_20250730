package com.kmii.ch13.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue",96 );
		map.put("hong", 86 );
		map.put("white", 92 );
		
		String name = null;  // 최고 점수를 받은 아이디가 저장될 변수
		int maxScore = 0;   // 최고 점수가 저장될 변수
		int totalScore = 0;  // 점수의 총합이 지정될 변수
		
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();  // 키, 값 한쌍에 대해서 iterator 사용
		
		
		while (iter.hasNext()) {
			 Map.Entry<String, Integer> entry = iter.next();
			 
			 
			 String key = entry.getKey();
			 int value = entry.getValue();
			 

			 totalScore += value;

			 if (value > maxScore) {
			    maxScore = value;
			    name = key;
			   }
	
	      
	     double avg = (double) totalScore / map.size();

	       
	     System.out.println("총점: " + totalScore);
	     System.out.println("평균 점수: " + avg);
	     System.out.println("최고 점수: " + maxScore);
	     System.out.println("최고 점수 받은 아이디: " + name);
	    
		}
		
		

	}
}

/* 


    
    	for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int score = entry.getValue();
	        totalScore += score;

	        if (score > maxScore) {
	        	maxScore = score;
	            name = entry.getKey();
	           }
	       }

    
    */


