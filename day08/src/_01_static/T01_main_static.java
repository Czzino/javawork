package _01_static;

public class T01_main_static {
	// 인스턴스변수, 클래스변수 초기 값이 0
	int a;
	static int b;
	
	public static void main(String[] args) {
		int c;
		// 지역변수
		// 클래스 변수, 클래스 메소드는 객체 생성 하지 안하도 사용가능
		// System.out.println(a); 인스턴스변수는 반드시 객체생성 해야만 사용가능
		// System.out.println(c); 지역변수를 초기화하지 않고 출력했기 때문	
		System.out.println(b);
		System.out.println(T01_api_static.nameSt);
//		System.out.println(T01_api_static.sMe3()); // 리턴값이 없기때문에 에러
		System.out.println(T01_api_static.sMe4());
		
		// 인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용가능
		T01_api_static s1 = new T01_api_static();
		System.out.println(s1.nameIn);
		System.out.println(s1.me2());
		// 객체에서도 클래스 변수, 클래스 메소드도 변강가능
		// 정적 변수, 메소드
		System.out.println(s1.numSt);
		System.out.println(s1.sMe4());
		T01_api_static s2 = new T01_api_static();
		
		// public 프로젝트, 클래스, 패키지 다 사용가능
		// 클래스앞에 붙는건 2가지
		// default : 아무것도 않넣었을떄 클래스, 필드. 생성자, 메소드 패키지 단위로 넘으면 사용할수 없음
		// 같은 패키지 내에서만 접근 가능
		
		// protected : 상속받을때만 사용
		// private : 같은 클래스 안에서 변수 사용
		
		
		
	}

}
