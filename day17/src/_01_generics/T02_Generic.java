package _01_generics;

class Delevery<T> {
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
		del.set("program");
		String str = del.get();

		Delevery<Integer> del2 = new Delevery<>();
		del2.set(7);
		int value = del2.get();

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
