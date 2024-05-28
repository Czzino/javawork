package _03_LinkedList;

import java.util.*;

public class T01_LinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(0, 1);
		list.addFirst(3); // index번호 상관없이 맨앞에 추가
		list.addLast(20); // 맨끝에 데이터추가 잘 사용하지 않음
		list.add(50);
		System.out.println("원본" + list);
		// 삭제 기능
		list.remove(1); // index번호 1번 삭제
		System.out.println(list);
		list.remove(); // 맨 앞 노드 삭제
		System.out.println(list);
		list.removeFirst(); // 맨앞 노드 삭제
		System.out.println(list);

		list.removeLast(); // 맨 끝노드 삭제
		System.out.println(list);

		/*
		 * for문을 쓰면 비효율적 : i번쨰 주소는 i-1번에 들어있어서 i-1을 먼저 찾아야ㄷ 되고 i-1의 주소를 찾으려면 i-2를 먼저
		 * 찾아야됨 결과적으로 0~i 까지 다시 돌아야 됨
		 */

		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}

		list.add(10);
		list.add(0, 1);
		list.addFirst(3); // index번호 상관없이 맨앞에 추가
		list.addLast(20); // 맨끝에 데이터추가 잘 사용하지 않음
		list.add(50);
		System.out.println(list); // iterator toString으로 되어있음
		// 순서가 없고 무작위로 가져옴
		// Iterator : 리스트를 순회할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator(); // list의 객체를 넣어줌
		// hasNext() => 남아있는객체가 있는가? 있으면 true 없으면 false
		while (iterator.hasNext()) {
			// next() => 순회하면서 객체를 얻어옴
			System.out.println(iterator.next() + " ");
		}

		list.clear(); // 리스트의 목록 전부삭제
		System.out.println("clear" + list);
		// get(int index)
		// 이 목록의 지정된 위치에 있는 요소를 반환합니다.
		// getFirst()
		// 이 목록의 첫 번째 요소를 반환합니다.
		// getLast()
		list.add(10);
		list.add(0, 1);
		list.addFirst(3); // index번호 상관없이 맨앞에 추가
		list.addLast(20); // 맨끝에 데이터추가 잘 사용하지 않음
		list.add(50);
		for (Integer it : list) {
			System.out.println("향상된 : " + it);
		}

		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list.get(2) : " + list.get(2));
		System.out.println("list.getFirst() : " + list.getFirst());
		System.out.println("list.getLast() : " + list.getLast());
	}

}
