package _01_HashSet;

import java.util.*;

public class T05_HashSet {

	public static void main(String[] args) {
		// 오른쪽 객체생성에서 자료형을 안써도 적용
		// 자동으로 Integer 형변환
		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {

			set.add((int) (Math.random() * 45) + 1);

		}
		System.out.println(set);

		set.clear();
		for (int i = 0; i < 6; i++) {
			set.add((int) (Math.random() * 45) + 1);
		}

		System.out.println(set);

		// set은 순서가 없어서 정렬하지 못함
		// 정렬을 하려면 List로 변환
		List list = new LinkedList(set); // ArrayList, Vector 모두 똑같이
		Collections.sort(list);
		System.out.println(list);
	}

}
