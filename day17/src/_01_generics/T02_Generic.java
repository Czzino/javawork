package _01_generics;

class Delevery<T> {
	// 대문자 T는 제네릭 타입 상징적 의미
	private T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}

class Gmarket<T> {

}

public class T02_Generic {

	public static void main(String[] args) {
//		Delevery<String> del = new Delevery<String>();
		Delevery<String> del = new Delevery<>();

		// 자료형변환 안해도됨
		// 제네릭 타입이 String이면 데이터를 String타입
		del.set("program");
		String str = del.get();

		Delevery<Integer> del2 = new Delevery<>();
		del2.set(7);
		int value = del2.get();

		// 사용자 정의 객체는 new하고 생성
		Delevery<Gmarket> del3 = new Delevery<>();
		del3.set(new Gmarket());
		Gmarket g = del3.get();
		/*
		 * Delevery<Gmarket> del4 = new Delevery<>();
		 *  del4.set(new String()); 
		 *  Gmarket g1 = del4.get();
		 */
	}

}
