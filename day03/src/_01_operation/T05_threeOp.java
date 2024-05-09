package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 ? 조건이 참일떄 실행 : 조건이 거짓일때 실행
		int num1 =10;
		int num2 = 7;
		Scanner scan = new Scanner(System.in);
		String re = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(re);
		System.out.println(num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다");

		// 숫자를 무조건 양수로 출력
		int num3 = -8;
		int num4 = num3 < 0 ? -num3 : num3;
		System.out.println("절대값 : : " + num4);
		System.out.println("절대값 : : " + (num3 < 0 ? -num3 : num3));
		
		// 사용자로부터 점수를 80 입력받아서 합격, 그렇지 않으면 불합격 출력
		// 숫자형을 입력받는 기능
		// 문자열을 숫자형으로 받아
		
		System.out.print("점수를 입력 해주세요 : ");
		int score = scan.nextInt();	
		System.out.println("" + (score >= 80 ? "합격" : "불합격"));
		
		String re3 = score >= 80 ? "합격" : "불합격";
		System.out.println(re3);
		
		// 90 ~ 100 A : 90 ~ 80 B : 80 ~ 70 C : 60 >= D :F  
		String re4 = 
		score >= 90 ? "A" : 
	    score >= 80 ? "B" : 
		score >= 70 ? "C" : 
		score >= 60 ? "D": "F";
		System.out.println(re4);
		
	}

}
