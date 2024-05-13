package _02_conditional;

import java.util.Scanner;

public class T01_if {
	public static void main(String[] args) {
		/*
		  // 조건문
		 if(조건문) {
		 	조건이 참일때 실행할 프로그램
		 } 
		 */	
		// if문의 실행할 코드가 한줄일때는 중괄호({})를 않넣어도되고 넣어두됨
		Scanner scan = new Scanner(System.in);
		int num1 = 100;
		if(num1 != 100) 
			System.out.println("100점 입니다.");
		
		if(num1 == 100) {
			System.out.println("100점 입니다.");
			System.out.println("안녕.");  	
		}
		
		int num2 = 95;
		if(num1 > num2) { 
			System.out.println(num1 + "은" + num2 + "보다 작다");
		}
		System.out.println("if문 조건과 상관없이 실행");
		
		// 사용자로 부터 점수를 입력받아 80점 이상이면 합격입니다. 축하합니다.
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scan.nextInt();
		if (score >= 80) {
			System.out.println("합격입니다.");
			System.out.println("축하합니다.");
		} else {
			
		}		
	}
	

}
