package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {

		// Scanner 에러
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력");
		int sum = 0;
		for(int i=1; i<=3; i++) {
			System.out.print(i+ "번쨰 정수 입력 :");

			try {
				// 엔터가 어디에 있는지 확인
				int num = sc.nextInt();
				sum += num;	
			} catch(InputMismatchException e){
				System.out.println("정수가 아닙니다");
				sc.nextLine();
				i--;
			}
			
		}
		System.out.println("합계 : " + sum);
		
	}

}
