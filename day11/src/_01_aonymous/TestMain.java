package _01_aonymous;

// 부모 클래스
class Parent {
	String method() {
		return "부모의 재산";
	}
}

// 자식 클래스
class Child extends Parent {
	@Override
	String method() {
		return "자식의 재산";
	}
}

public class TestMain {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
		System.out.println(p.method());

		// 자식클래스 사용하지못하고 안에 내용만 사용
		// 익명 클래스 : 재사용할 필요가 없을떄 1번만 정의하여 사용
		// 1번만 사용하는데 클래스를 만드는것은 비효율적임
		Parent p2 = new Child() {
			int age = 25;

			@Override
			String method() {
				System.out.println(age);
				return "다 냬꺼";
			}
		};
		System.out.println(p2.method());
	}
}
