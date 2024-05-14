package _02_method;

public class T01_main_method {

	public static void main(String[] args) {
	
		T01_api_method method = new T01_api_method();
		// void 메소드는 반환값이 없는 메소드
		method.print1();
		// 반환형이 없는 메소드는 변수에 저장할 없고, 출력할수도 없다.
		// int abc = method.print1();
		//sysout.print ob1.print1() 할수 없음
//		method.print2(); //  값이 10
		int result = method.print2();
	
		result *= 2; // 연산
		System.out.println(result);
		System.out.println(method.print2());
		System.out.println(method.print3());
		method.print4(5);
		
		int re2 = method.print5(7,8);
		System.out.println(re2);
		
		method.print6("더조은", 100);
		
		T02_api_method method2 = new T02_api_method();
		int result2 = method2.add(100, 200);
		System.out.println(result2);
		System.out.println(method2.add(100, 200));
		System.out.println(method2.minus(10,5));
		System.out.println(method2.multiply(10, 5));
		System.out.printf("%2.f", method2.divide(10,3));
	}

}
