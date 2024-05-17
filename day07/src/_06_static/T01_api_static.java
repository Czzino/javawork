package _06_static;

public class T01_api_static {
	// 인스턴스 필드(속성)
	int num = 10; // 변수 
	final int MAX = 25; // 값을 변경할수 없는 상수
	
	void method() { // 매개 변수도 지역변수
		// 지역변수
		int me1 = 3;
		System.out.println(me1);
	}
	
	// 클래스필드 속성 클래스 가오라올떄 저장
	// 정정필드(속성)
	// 모든 클래스를 공용으로 사용하는 데이터
	static int sNum = 20;
	static String sName = "이보영";
	
}
