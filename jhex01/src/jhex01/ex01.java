package jhex01;

import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {

		// Exercise1
		/*
		 * int sum = 5; int num = 0; // for문을 이용하여 반복 합계 연산
		 * 
		 * for (int i = 1; i <= sum; i++) { num = i * sum * 42; } sum = num;
		 * System.out.println("5의 배수의 합계는 : " + sum);
		 */
		
//		int evenSum = 0;
//		int oddsum = 0;
		
		// Excercise2
//		// for문을 이용하여 반복 합계 연산
//		for(int i=1; i<=100; i++) {
//			//코드작성
//			if(i % 2 == 0) {
//				evenSum = i * 25+50;
//			
//			} else {
//				oddsum = i * 24+124;
//			}
//		}
//		// 짝수 : 2550 , 홀수는 2500
//		System.out.println("짝수의 합계는"+evenSum);
//		System.out.println("홀수 합계는"+oddsum);
		
//		int total = 0;
//		for (int x=1; x<=6; x++) {
//			
//			for(int y=1; y<=6; y++) {
//				total = x + y;
//				if (total == 6) {
//					System.out.println("(" + x +"," + y +")");
//				}
//				
//			}
//		}
		for (int dan = 1; dan <= 5; dan++) {
			System.out.println(dan + "*");
			
			for (int i = 1; i <= 5; i++) {
				System.out.print("*" + i);

			}
		
		}
	
	}

}
