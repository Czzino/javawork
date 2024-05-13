package _01_operation;

public class T01_assignment {
	public static void main(String[] args) {
		// % 값을 나눈 나머지 몫만 출력
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		System.out.println("몫 : " + num1 / num2);
		System.out.println("나머지 : " + result);
		
		// num1 을 더한값을 num1의 덮어씌움
		num1 = num1 + 10;
		System.out.println("num1 + 10 : " + num1);
		
		// += 더하기 연산 축약
		// num1 = num1 + 10
		num1 += 10;
		System.out.println("num1 += 10 : " + num1);
		
		num1 += 5;
		System.out.println("num1 += 5 :" + num1);
		
		// -= 빼기 연산 축약
		num1 -= 8;
		System.out.println("num1 -= 8 : " + num1);
		
		// *= 곱하기 연산 축약
		num1 *= 8;
		System.out.println("곱하기 : "+num1);
		
		// %= 나누기 연산 축약
		num1 /= 8;
		System.out.println("num1 /= 8 : " + num1);
		
		// 나누기 몫만 출력
		num1 %= 4;
		System.out.println("num1 %= 4 : " + num1);
		
		// 큰숫자 넣을때는 _ 기호를 넣어서 사용
		// 컴퓨터는 숫자로 인식, 사람이 보기 편하도록 함
		// int num3 = 300,000,000
		int num3 = 300_000_000;
		System.out.println(num3);				
	}

}
