package _02_repetitive;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		// 주사위의 숫자 맞추기 게임
		// (int)(Math.random() * 5);
		// com의 숫자는 1~6
		
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random() * 6) + 1;
		int user;
		int num;
		do {
			System.out.println("주사위의 숫자를 맞춰보세요 : ");
			num = com;
			user = scan.nextInt();
			
			if(com == user) {
				System.out.println(num + "번");
				System.out.println("축하합니다. 맞췄습니다");
				
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요");
			}
	
		} while(com != user);
	}

}
