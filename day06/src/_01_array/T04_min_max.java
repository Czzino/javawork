package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {
		// 자리바꿈
//		int num1 = 10;
//		int num2 = 20;
//		
//		// num2 값을 num1에 자리바꿈이 안됨
//		num1 = num2;
//		num2 = num1;
//		// 임시저장 num1 = temp 값을 임시저장하고 
//		// max = 9 , min = 1;
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
		// 1차원 배열의 min값과 max갑 가져오기
		// index 비교할떄 큰값이 있으면 비교 아니면 비교하지 않음 자리바꿈
		// int score = {8,4,9,2,6,1,3,5,7};
		int[] score = { 8, 4, 9, 2, 6, 1, 3, 5, 7 };
//		Scanner scan = new Scanner(System.in);
//		System.out.println("min 값 입력 : ");
//		System.out.println("max 값 입력 : ");
//		int min = scan.nextInt();
//		int max = scan.nextInt();
//		System.out.println("min : " + min);
//		System.out.println("max : " + max);

		// 0으로 초기화 한값은 비교하지 않음

//		min > score[1]
//		min  = score[1]

		int min = score[0];
		int max = score[0];
		// 4 하고 2하고 비교했을 작은값이니까 조건문 실행
		for (int i = 1; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
			if (max < score[i]) {
				max = score[i];
			}

		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

		// index번호 연산 가능
		int k = 2;
		System.out.print(score[k]); // 2번쨰
		System.out.print(score[k + 5]); // 7번쨰
		System.out.print(score[k * 3]); // 6번째
		System.out.print(score[k - 1]); // 1번째

		int arri[] = new int[10];
		for (int i = 0; i < arri.length; i++) {
			arri[i] = (int) (Math.random() * 10);
		}

		// Arrays 출력문
		for (int i = 0; i < arri.length; i++) {
			System.out.println(arri[i] + ", ");
		}

		// for문 대신 사용 Arrays 출력
		// Arrays클래스 라이브러리(API)를 이용한 출력
		System.out.println(Arrays.toString(arri));

		// 미리 만들어놓은 라이브러리
		// Byte, Integer, Double

	}

}
