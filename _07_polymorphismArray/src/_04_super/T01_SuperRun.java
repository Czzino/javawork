package _04_super;

class Parent {
	int x = 10;
} 

class Child extends Parent {
	int x = 20;
	void show() {
		int x = 30;
		System.out.println("x=" + x); // 지역변수 -> 인스턴스 변수 -> 부모 변수
		System.out.println("this.x=" + this.x); // 인스턴스 변수 -> 없으면 부모 변수
		System.out.println("super.x=" + super.x); // 부모 변수 
	}
}

public class T01_SuperRun {
	// 파일이름이 메인메스드와 같아야 오류가 안남
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		
		
	}

}
