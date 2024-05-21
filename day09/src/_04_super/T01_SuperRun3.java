package _04_super;

class Parent3 {

	int z;
	Parent3() {
		System.out.println("부모 생성자 호출");
		z = 10;
	}
} 

class Child3 extends Parent3 {
	int x = 10;
	int y = 10;
	Child3(){
		System.out.println("자식 생성자 호출");
		x = 10*10;
		y = 10*10;
	}

}
class GrandChild extends Child3{
	int x;
	GrandChild(){
		System.out.println("손자 생성자 호출");
		x = 10*10*10;
	}
}

public class T01_SuperRun3 {
	// 파일이름이 메인메스드와 같아야 오류가 안남
	public static void main(String[] args) {

		// 자식에서 객체 생성할때 없으면 부모 생성자를 호출
		GrandChild child = new GrandChild();
		System.out.println(child.x); // 손자에서 실행
		System.out.println(child.y); // 손자에서 실행 
		System.out.println(child.z); // 손자에서 실행
//		System.out.println(child.super.x); // super는 상속받은 곳에서만 사용
		
		
	}

}
