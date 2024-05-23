package _01_langPackage;

import java.util.Arrays;

class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y" + y;
	}

}

class Circle implements Cloneable {
	Point p; // 중심점
	double r; // 반지름

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	// 모든 객체가 Object 타입 아래
	// 반환형이 Circle > Object 타입

	@Override
	public Circle clone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle) obj;
	}

	@Override
	public String toString() {
		return "p=" + p + "], r=" + r;
	}

	// 인스턴스 변수가 기본자료형이면 깊은복사
	// 인스턴스변수가 참조자료형이면 얕은복사(즉, 주소만 복사)
	public Circle deepClone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// 새로운 객체를 생성해서 사용
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}

}

public class T05_cloneShallowDeepCopy {

	public static void main(String[] args) {

		// 얕은 복사
		String[] str = { "a", "b", "c" }; // str 변수에 String[] 주소값
		String[] copyStr = str; // str 주소값을 copyStr 주소 복사

		str[0] = "d";
		System.out.println(str[0]);
		System.out.println(copyStr[0]);

		// 깊은 복사
		// 1.
		String[] deepCopy = new String[5];
		for (int i = 0; i < str.length; i++) {
			deepCopy[i] = str[i];
		}
		System.out.println(Arrays.toString(deepCopy));
		str[0] = "a";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("-------------------------------------");

		// 2. Array.copyOf(원본배열, 복사할 길이) 전체 길이
		String[] arrayCopy = Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(str));
		System.out.println("-------------------------------------");

		arrayCopy[2] = "z";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println("-------------------------------------");
		System.out.println();

		// 3. clone()
		Circle c1 = new Circle(new Point(5, 10), 3);
		Circle c2 = c1.clone();

		System.out.println(c1);
		System.out.println(c2);

		c1.r = 100.0;
		c1.p.x = 700; // this로 부모객체로 데이터 보냄
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-------------------------------------");

//		Circle c3 = c1.deepClone();
		c1.r = 50.0;
		c1.p.x = 1000; // this로 부모객체로 데이터 보냄
		System.out.println(c1);
//		System.out.println(c3);
		
		// 배열에는 clone 은 기본으로 되어 있음
		int[] num = {1,2,3};
		int[] numClone = num.clone();
		numClone[0] =100;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(numClone));
	}
}
