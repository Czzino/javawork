package _03_overriding;

// 오버라이딩
class Over {
	void show(String str) {
		System.out.println("부모 클래스 메소드" + str);
	}
}

// 자료형이 같고 변수명은 달라도됨
class OverChild extends Over {
	void show(String abd) {
		System.out.println("자식 클래스 메소드" + abd);
	}
}

public class OverridingRun {
	public static void main(String[] args) {
	
		// 자식 먼저 호출
		OverChild ochild = new OverChild();
		ochild.show("자바 프로그래밍");

		Over over = new Over();
		over.show("오라클");
	}

}
