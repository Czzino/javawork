package jhex04;

import java.util.Scanner;

public class try_catch {
	public static void main(String[] args) {

		Number number = new Number();

		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("사용자로부터 2개의 숫자 입력(1~100사이 숫자)");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("정수 1:" + num1);
			System.out.println("정수 2:" + num2);

			for (int i = 0; i <= 100; i++) {
				int sum = num1 + num2;
				if (sum % 5 == 0) { // i값이 5로 나누어서 0으로 떨어지면 5배수로 판단
					System.out.println("15는 5의 배수인가? true");
					number.witdraw(true);
				} else {
					System.out.println("14는 5의 배수인가? false");
					number.witdraw(false);
				}

			}
		} catch (UserException e) { // extends 상속받은 Exception 기능을 사용함
			System.out.println(e.getMessage());
		}
	}

}
