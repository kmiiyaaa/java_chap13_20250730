package java_ch13_20250730;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList<String>();  //  List는 인터페이스 - 직접개체로 쓸수 x, 아래 자식중에 하나(arraylist)로 객체지정
		
		strList.add("Kor");
		strList.add("Jap");
		strList.add(1, "USA");  // USA가 1번인덱스로 들어감
		
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		
		System.out.println("-------------------------");
		
		strList.remove(1); //USA 인덱스 삭제
		
		System.out.println(strList.get(0));   // kor
		System.out.println(strList.get(1));   //jap
		//System.out.println(strList.get(2)); // out of bounds 에러 발생! 인덱스 해당하는 내용x
	}

}
