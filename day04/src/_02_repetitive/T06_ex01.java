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
			System.out.print("주사위의 숫자를 맞춰보세요 : ");
			num = com; // math 함수의 임의의 정수 값 int형으로 한자리수로 변경
			user = scan.nextInt(); // 사용자가 입력했을떄 받아오는 정수형 숫자 값
			
			if(com == user) { // 사용자가 입력한값과 프로그램 내부에 math 함수의 정수값을 비교했을대 같은지 확인
				System.out.println(num + "번");
				System.out.println("축하합니다. 맞췄습니다");
				
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요");
			}
	
		} while(com != user); // 사용자 입력값과 프로그램 내부에 있는 정수값을 비교했을대 같으면 무한반복, 
							  //그래서 같지 않음을 비교해서 반복문을 나옴
	}

}
