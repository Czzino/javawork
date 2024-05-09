package _01_operation;

public class T03_compare {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 50;
		// 스택에 쌓인데이터가 달라서 false 주소값이 다름
		// 기본자료형은 스택에 쌓인후 주소값을 비교해서 사용
		boolean result = num1 == num2;
		System.out.println("num1과 num2의 값이 같은가? : " + result);
		System.out.println("num1과 num2의 값이 같은가? : " + (num1 == num2));
		System.out.println("num1과 num2의 값이 같은가? : " + (num1 != num2));	
	}

}
