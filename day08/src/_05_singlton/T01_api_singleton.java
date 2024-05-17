package _05_singlton;

// 싱글톤 : 전체 프로그램에서 단하나의 객체만 만들도록 보장하는 기법
//		: main실행 클래스에서 객체를 만들지 못하도록 해야함
public class T01_api_singleton {
	// 인스턴스 변수 => 정적 변수 바꾸어줌 그래야 호출할 수 있음
	// 객체를 생성하지 않고 사용하는 방법
	private static T01_api_singleton singleton = new T01_api_singleton();
	
	private T01_api_singleton(){
		System.out.println("객체 생성");
	}
	
	// 인스턴스 변수 => 정적 변수 바꾸어줌 그래야 호출할 수 있음
	static T01_api_singleton getSingleton(){
		// 객체에 주소가 들어옴
		return singleton; // 정적메소드에서 정적 필드만 사용가능 그래서 변수앞에 static 붙어야됨
	}
}
