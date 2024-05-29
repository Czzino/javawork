package _02_HashMap;

import java.util.*;

public class T01_HashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("천진호", 85);
		map.put("아무개", 76);
		map.put("김수현", 85);
		map.put("김지원", 100);
		System.out.println("size : " + map.size());

		// get(키) : 결과는 값이 리턴됨
		System.out.println("점수 : " + map.get("천진호"));
//		System.out.println("점수 : " + map.get("아무개"));
//		System.out.println("점수 : " + map.get("김수현"));
//		System.out.println("점수 : " + map.get("김지원"));
//		
		// 키값이 오버라이딩되어서 출력
		System.out.println(map);

		// remove(키) : 객체 삭제
		map.remove("천진호");
		System.out.println(map);
		
		
	}

}
