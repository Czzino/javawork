package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {

		// 사용자로부터 갯수를 입력받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("갯수를 입력 해주세요.");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			TreeSet ts = new TreeSet();
			while (ts.size() < 6) {
				ts.clear();
				ts.add((int) (Math.random() * 45 + 1));
			}

			System.out.println(ts);
		}

	}

}
