package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// switch-case
//		int num1 = 1; // 1~2만 들어있는 변수
//		
//		switch(num1) {
//		case 1:
//			System.out.println("1입니다.");
//			break; // 스위치문 빠져나감
//		case 2:
//			System.out.println("2입니다.");		
//		}
//		
		
//		System.out.print("숫자 입력(0~2 숫자만) : ");
//		int num2 = scan.nextInt();
		
//		switch(num2) {
//		case 0:
//			System.out.println("0입력함");
//			break;
//		case 1:
//			System.out.println("1입력함");
//			break;
//		case 2:
//			System.out.println("2입력함");
//			break;
//		default :
//			System.out.println("잘못입력");
//		}
		
//		char ch = 'K'; // k, l, p
//		switch(ch) {
//		case 'K' :
//			System.out.println("김씨입니다");
//			break;
//		case 'l' :
//			System.out.println("이씨 입니다.");
//			break;
//		case 'p' :
//			System.out.println("박씨입니다.");
//			break;
//		default :
//			System.out.println("성이 김,이,박씨가 아닙니다.");
//		}
//		System.out.println("----------------------------------------");
//		
//		switch(ch) {
//		case 'K' :
//			System.out.println("김씨입니다");
//			
//		case 'l' :
//			System.out.println("이씨 입니다.");
//		
//		case 'p' :
//			System.out.println("박씨입니다.");
//			
//		default :
//			System.out.println("성이 김,이,박씨가 아닙니다.");
//		}
//		
//		int month = 2;
//		
//		switch(month) {
//		case 1:
//		case 2:
//		case 12:
//			System.out.println("겨울");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여");
//			break;	
//	    case 9:
//		case 10:
//		case 1:
//			System.out.println("가을");
//			break;
//		}
		
		// 문1. 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력
		//3 + 1
		//첫번째숫자입력 : 3
		//두번쨰숫자입력 : 1
		//연산자입력 : + (+,-,*,/,%)
		
		System.out.print("첫번째숫자 입력 해주세요 : ");
	    int num1 = scan.nextInt();
		System.out.print("두번쨰숫자 입력 해주세요 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산할 두 숫자와 연산자 입력( ex] 3 + 7 :)");
		int num3 = scan.nextInt();
	
		char op1 = scan.next().charAt(0); 
//		-> case '+': 외따옴표로 
	    String op2 = scan.next();
		int num4 = scan.nextInt();
		
		// String switch case 
		switch(op2) {
		case "+":
			System.out.println(num3 + "+" + num4 + "=" + (num3+num4));
			break;
		case "-":
			System.out.println(num3 + "-" + num4 + "=" + (num3-num4));
			break;
		case "*":
			System.out.println(num3 + "*" + num4 + "=" + (num3*num4));
			break;
		case "/":
			System.out.printf("%d%s%d=%.2f\n",num3,op2,num4,(double)num3/num4);
			//System.out.println(num3 + "/" + num4 + "=" + (num3-num4));
			break;
		case "%":
			System.out.println(num3 + "%" + num4 + "=" + (num3%num4));
			//System.out.println(num3 + "/" + num4 + "=" + (num3-num4));
			break;
		}
		
//		switch(op1) {
//		case '+':
//			System.out.println(num3 + "+" + num4 + "=" + (num3+num4));
//			break;
//		case '-':
//			System.out.println(num3 + "-" + num4 + "=" + (num3-num4));
//			break;
//		case '*':
//			System.out.println(num3 + "*" + num4 + "=" + (num3*num4));
//			break;
//		case '/':
//			System.out.printf("%d%s%d=%.2f\n",num3,op1,num4,(double)num3/num4);
//			//System.out.println(num3 + "/" + num4 + "=" + (num3-num4));
//			break;
//		case '%':
//			System.out.println(num3 + "%" + num4 + "=" + (num3%num4));
//			//System.out.println(num3 + "/" + num4 + "=" + (num3-num4));
//			break;
//		}
	
		System.out.println("연산 결과 + : " + (num1 + num2));
		System.out.println("연산 결과 - : " + (num1 - num2));
		System.out.println("연산 결과 * : " + (num1 * num2));
		System.out.println("연산 결과 / : " + (num1 / num2));
		System.out.println("연산 결과 % : " + (num1 % num2));
		
	}

}
