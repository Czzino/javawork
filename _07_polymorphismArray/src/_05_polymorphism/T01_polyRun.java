package _05_polymorphism;
class A{int a=1;}
class B extends A{int b=2;}
class C extends A{int c=3;}
class D extends B{int d=4;}
class E extends C{int e=5;}

public class T01_polyRun {
	public static void main(String[] args) {	
		// 다형성
		// 자동 형변환 : 자식을 부모 타입으로 형변환
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// A만 사용함 부모객체는 생성후 사용하지 않음
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		// 역순으로 자식이 부모형변환 할수업음
		// B b1 = c;
		// C c1 = d;

		
		System.out.println(b.a); // A타입으로 형변환해서 사용
		System.out.println(b.b); 
		System.out.println(a1.a);
//		System.out.println(a1.b); // A 클래스 타입을 형변환 했기 때문에 A클래스만 사용할수 있다 
//		System.out.println(a1.a); // c변수 사용불가
//		System.out.println(a2.a); // d 변수 사용불가
//		System.out.println(a4.a); // e 변수 사용불가
	}

}
