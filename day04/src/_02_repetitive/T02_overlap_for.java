package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			// 안쪽 for문이 끝날때
			System.out.println();
		}

		/*
		 * // 구구단 2*1=2 2*2=4
		 * 
		 * ... 2*9=18
		 * 
		 * 3*1=3 3*2=6 3*3=9 ...
		 */

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			// System.out.println("*** " + dan + "단 ***");
			for (int i = 1; i <= 9; i++) {
				// 2*1=2
				// 2*2=4

				System.out.println(dan + "*" + i + "=" + dan * i);
			}
			System.out.println();
		}

		// 사용자로 부터 숫자를 입력받아 별 출력
		// ex) 숫자입력 : 5
//		*
//		**
//		***
//		****
//		*****

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 해주세요 : ");
		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 엔터치는 역할
		}

		for (number = 2; number <= 9; number++) {

			for (int i = 1; i <= 9; i++) {

				System.out.println(number + " x " + i + " = " + number * i);
			}
			System.out.println(); // 엔터치는 역할
		}

		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				// System.out.println(dan + "*" + i + "=" + dan*i + "\t");
				System.out.printf("%d*%d=%2d\t", dan, i, dan * i);
			}
			System.out.println();
		}

	}

}
