package _04_super;

class Parent2 {
	int x = 10;
	void show() {
		System.out.println("부모클래스 메소드");
	}
} 

class Child2 extends Parent2 {
	int x = 20;
	void show() {
		System.out.println("자식 클래스 메소드");
	}
	void display() {
		show();
		super.show();
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class T01_SuperRun2 {
	// 파일이름이 메인메스드와 같아야 오류가 안남
	public static void main(String[] args) {
		
	  Child2 child2 = new Child2();
	  child2.show();
	  child2.display();
		
	}

}
