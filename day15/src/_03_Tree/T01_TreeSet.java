package _03_Tree;

import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {

		// 이중트리 구조
		// int형을 Integer로 형변환가능 자식 부모
		TreeSet<Integer> score = new TreeSet<Integer>();

		score.add(87);
		score.add(98);
		score.add(75);
		score.add(95);
		score.add(80);

		// 가장 작은값
		System.out.println("가장 낮은 점수 :" + score.first());
		
		// 가장 높은점수
		System.out.println("가장 높은 점수 :" + score.last());
		
		// 95점보다 아래점수
		System.out.println("95점 바로 아래점수: " + score.lower(95));
		
		// 95점보다 바로 위의 점수
		System.out.println("95점 바로 위의 점수 : " + score.higher(95));
		
		// 95점이거나 없으면 바로 아래점수
		System.out.println("95점이거나 없으면 바로 아래점수 " + score.floor(95));
		
		System.out.println("95점이거나 없으면 바로 위의점수 " + score.ceiling(95));

		// 들어 있는 객체 수
		System.out.println("들어 있는 객체 수 : " + score.size());
		
		System.out.println();
		while(!score.isEmpty()) {
			score.pollFirst(); // 가장 작은수 삭제
			System.out.println("남아있는 객체 수 : " + score.size());
		}
		
		
	}

}
