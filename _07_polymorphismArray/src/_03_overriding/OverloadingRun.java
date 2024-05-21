package _03_overriding;

// overloading 자료형이 다르던지 매개변수가 다르던지
class Loading {
	void show(String str) {
		System.out.println("부모 클래스 메소드 : " + str );
	}
}

class Loadingchild extends Loading {
	/// 오버로딩 : 매개변수의 자료형이 다름
	void show(int price) {
		System.out.println("자식 클래스 메소드 : " + price);
	}
	// 오버 라이딩
//	void show(String str) {
//		System.out.println("자식 클래스 메소드 : " + str);
//	}
}
public class OverloadingRun {

	public static void main(String[] args) {
		
		Loadingchild lChild = new Loadingchild();
		lChild.show(250000);
		lChild.show("리액트");
		
		

	}

}
