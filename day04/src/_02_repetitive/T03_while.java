package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {

		/*
		 * 
		 * while(조건식) { 조건식이 참일때 수행 }
		 */
//		for(int i=1; i<=3; i++) {
//			
//		}
		// while문 사용전에 변수 초기화
		int i = 1;
		while (i <= 3) { // 조건 식
			System.out.println(i); // 실행
			i++; // 증감
		}

		// 무조건 계속 도는 코드
		int j = 10;
		while (true) {
			if (j == 0)
				break; // 이조건이 만족하면 break 멈춤
			System.out.println(j);
			j--;
		}

		// 합계 구하기
//		int sum = 0;
//		int j = 1;
//		while(j<=100) {
//			sum+=j;
//			j++;
//			
//			sum += j++;
//		}
//		System.out.println("1~100까지 합 : " + sum);

		int x = 10;

		// x-- 조건식에서 감소부터해서 9부터 출력
		while (x-- != 0) {
			System.out.println(x);
//			x--;
		}
		System.out.println("-----------------------");
		// break : while문을 빠져나옴
		int count = 0;
		while (true) {
			System.out.println(++count);
			if (count == 5) {
				break;
			}
		}

//		while(true) {
//			System.out.println("멈추려면 'q' 넣으세요 :  ");
//			char ch = scan.next().charAt(0);
//			
//			if(ch == 'q') {
//				break;
//			}
//		}
//		System.out.println("프로그램이 종료되었습니다.");

		// 문1. 사용자로부터 연산할 2숫자와 연산자를 입력받아 그 결과를 출력
		// 연산자에 @ 멈추고 그렇지 않으면 계속 입력 받아 결과 출력

		/*
		 * ex) 연산할 연사자와 2숫자 입력 : + 4 9 4+9=13 연산할 연산자와 2숫자 입력 : * 9 연산할 연산자와 2숫자 입력 : @
		 * 4 9 프로그램을 종료 합니다.
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("연산할 연산자와 2개의 숫자 입력( ex] + 3 9) :");
			char op = sc.next().charAt(0);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (op == '@')
				break;

			switch (op) {
			case '+':
				System.out.println(num1 + "" + op + num2 + "=" + (num1 + num2));
				break;
			case '*':
				System.out.println(num1 + "" + op * num2 + "=" + (num1 * num2));
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
