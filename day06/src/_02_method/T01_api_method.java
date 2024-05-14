package _02_method;

public class T01_api_method {
	
	// 반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	}
	int print2() {
		System.out.println("반환값이 int이고 매개변수는 없는 메소드");
		int result = 10;
		return result;
	}
	
	// String 타입의 반환형
	String print3() {
		System.out.println("반환값이 String이고 매개변수는 없는 메소드");
		return "반환되는 문자열";
	}
	
	// 매개변수
	// 하나의 숫자를 반드시 너으시오
	void print4(int x) {
		System.out.println(x);
	}
	
	int print5(int x, int y) {
		int result = x + y;
		return result;
	}
	
	void print6(String str, int z) {
		System.out.println("입력한 문자열 : " + str );
		System.out.println("입력한 숫자 : " + z); 
	}
	
}
