package _03_overloading;

// class 한곳에 두개 생성 가능
class Over {
	// overloading 조건
	// 1. 메서드 이름이 같아야 한다
	// 2. 매개변수의 개수가 다르던지 자료형이 달라야 한다
	// 3. 타입이나 리턴값은 상관 없음
	int add() {
		return 0;
	}

	int add(int num1) {
		return num1;
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}

	double add(int num1, double num2) { // 리턴 자료형은 상관없음
		return num1 + num2;
	}

	String add(String name) {
		return "이름 : " + name;
	}

}

public class T01_main_overloading {

	public static void main(String[] args) {
		Over over = new Over();
		System.out.println(over.add());
		System.out.println(over.add(7));
		System.out.println(over.add(3, 5));
		System.out.println(over.add(3, 5.0)); // int, double 자동 더블형 변환
		System.out.println(over.add("천진호"));
	}

}
