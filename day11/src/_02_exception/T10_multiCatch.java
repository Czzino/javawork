package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_multiCatch {

	public static void main(String[] args) {

		try {
			int[] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 :");
			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				System.out.print(i + 1 + "번쨰 정수 입력 :");
				num[i] = sc.nextInt();
				sum += num[i];
			}

			num[3] = 5;

			System.out.println("합계 : " + sum);
			// 위에서 내려오면서 순서대로 catch 확인
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어 섰습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 넣으세요");
		} catch (Exception e) {
			// 위에거 전부 안서도되고 Exception 하나만 써도됨
			System.out.println("예외 발생");
		}
	}

}
