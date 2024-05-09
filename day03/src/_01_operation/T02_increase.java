package _01_operation;

public class T02_increase {
	public static void main(String[] args) {
		// ++ 더하기 1 증가
		int num1 = 10;
		num1 = num1 + 1;
		num1 += 1;
		num1++; // 제일 많이 사용
		System.out.println(num1);
		
		// -- 뺴기 -1 감소
		num1 = 10;
		num1--;
		System.out.println(num1);
		
		// 단항 연산자일때는 연산자가 앞이나 뒤나 똑같음
		// 항이 하나일떄
		++num1;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		// 이항 연산자일때는 연산자의 위치에 따라 결과가 달라짐
		// ++num2 와 ++num3 가 먼저 실행되고 연산됨
		int num2 = 10;
		int num3 = 10;
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		// ++이 뒤에 붙으면 마지막에 실행
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = num2-- + num3--;
		
		num2 = 10;
		num3 = 10;
		int  num4 = 10;
		result = ++num2 + num3-- - num4++;
		// result = 11 + 9 - 11;
		System.out.println(result);
		
	}

}
