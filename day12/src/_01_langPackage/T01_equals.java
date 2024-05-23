package _01_langPackage;

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	// 타입이 달라서 오류
	@Override
	public boolean equals(Object o) {
//		this.value == o.value;
		return value == ((Value)o).value;

	}
}

public class T01_equals {
	public static void main(String[] args) {

		// Object
		Value val1 = new Value(10); // 0x 23
		Value val2 = new Value(10); // 

		
		// Object클래스의 equals 는 주소가 같은가를 물어본다
		// 오버라이딩 으로 값이 같은가를 묻는 메소드를 만들어 사용
		if(val1.equals(val2)) {
			System.out.println("val1과 val2가 같다");
		} else {
			System.out.println("val1과 val2가 다르다");
		}
		
		Value v3 = val1;
		if(val1.equals(v3)) {
			System.out.println("val1과 val2가 같다");
		} else {
			System.out.println("val1과 val2가 다르다");
		}
	}

}
