package _02_variable;

public class T_03_booleans {

	public static void main(String[] args) {
		// 기본자료형이 String이어서 문자로 true
		boolean bool01 = true;
		boolean bool02 = false;
		System.out.println(bool01);
		
		// 결과값이 true, false 일떄
		boolean bool03 = 10 < 3;
		System.out.println(bool03);

		int num1 = 10;
		int num2 = 20;
		// 참 거짓 판별할떄 사용
		boolean bool04 = num1 <= num2;
		System.out.println(bool04);	
	}

}
