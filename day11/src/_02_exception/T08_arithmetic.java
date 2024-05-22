package _02_exception;
import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {

		// 0으로 나눌떄 나오는 Exception
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 2개 입력");
//		int sum = 0;
//		for(int i=1; i<=3; i++) {
//			System.out.print(i+ "번쨰 정수 입력 :");
//
//			try {
//				// 엔터가 어디에 있는지 확인
//				int num = sc.nextInt();
//				sum = i;
//				System.out.println("나눈 몫 출력 : "+ sum/num);
//				System.out.println("나눈 나머지 출력 : " + sum%num);
//			} catch(ArithmeticException e){
//				System.out.println("0으로 입력된 값이 아닙니다");
//				sc.nextLine();
//				i--;
//			}
//			
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("나누기 할 정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			System.out.println("몫 : " + num1 / num2);
			System.out.println("나머지 : " + num1 % num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		}

	}

}
