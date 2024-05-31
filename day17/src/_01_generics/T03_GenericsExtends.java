package _01_generics;

import java.util.*;

class Fruit {

	@Override
	public String toString() {
		return "Fruit";
	}

}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Banana extends Fruit {
	@Override
	public String toString() {
		return "Banana";
	}
}

class Tjoeun {

	@Override
	public String toString() {
		return "tjoeun";
	}

}

// Fruit , Object 다됨 제네릭
class Box2<T> {
	ArrayList<T> list = new ArrayList<>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return list.toString();
	}

}

public class T03_GenericsExtends {

	public static void main(String[] args) {

		Box2<Fruit> fruitBox = new Box2<>(); // 부모 자식간
		Box2<Apple> appleBox = new Box2<>(); // 부모 자식간
		Box2<Tjoeun> tjoeunBox = new Box2<>(); // 상속하지 않음

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Banana());

//		fruitBox.add(new Tjouen()); Fruit과 관련이 없다오류 상속관계가 아님
		appleBox.add(new Apple()); // apple만 담을수 있음
//		appleBox.add(new Fruit()); 부모안됨

		tjoeunBox.add(new Tjoeun()); // Tjouen만 담을 수 있다 extends가 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);

	}

}
