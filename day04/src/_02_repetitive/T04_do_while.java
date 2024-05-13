package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		/*
		 - 조건을 나중에 확인하므로 조건과 상관없이 1번은 반드시 실행
		  do {
			실행문
		 
		 }while(조건식)
		 */
		
		boolean b1 = false;
		while(b1) {
			System.out.println("while 조건문");
		}
		// 무조건 한번 실행
		do {
			System.out.println("do = while 조건문");
		} while(b1);	
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. for문 설명, 2. while문 설명, 3. do-while문 설명, 0. 끝내기 : ");
		    num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("조건의 횟수 정해져 있을 떄 사용하면 좋음");
				break;
			case 2:
				System.out.println("특정 조건에 도달했을 떄 break를 이용하여 끝낼때 사용하면 좋음");
				break;
			case 3:
				System.out.println("조건을 나중에 확인하므로 무조건 1번은 실행");
			}
			
				
			
		} while(num != 0); // num이 0일때 do문이 계속 도니까 같지 않음으로 설정
		System.out.println("프로그램 종료");
		
	}

}
