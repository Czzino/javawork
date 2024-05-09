package _01_print;

public class T02_printf {

	public static void main(String[] args) {	
		// 십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d , %d\n", 10, 20);
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1, num2);
		
		// 8진수 출력
		System.out.printf("%o\n",9);
		
		// 16진수 출력
		System.out.printf("%x\n", 13);
		System.out.printf("%X\n", 13);
		
		// 자료형 출력
		// 실수형 출력 6 자리까지 반올림
		System.out.printf("%f\n",3.5555555555555);
		
		// 문자1개 출력
		// 문자한개일때는 호따옴표
		System.out.printf("%c\n", 'm');
		
		// 문자열 출력
		System.out.printf("%s\n", "천진호");
		
		// boolean 타입 출려
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 7 > 3);
				
		// 이 과정의 정원은 25명이고, 현재 25명 수강중 입니다. 100%를 달성했습니다.
		System.out.printf("이 과정의 정원은 %d이고, 현재 %d명 수강중 입니다. %d%%를 달성했습니다.", 25, 25, 100);		
				
	}

}
