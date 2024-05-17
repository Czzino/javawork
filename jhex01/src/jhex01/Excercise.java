package jhex01;


class Excercise {

private static Excercise singleton = new Excercise();
	
	
	// 인스턴스 변수 => 정적 변수 바꾸어줌 그래야 호출할 수 있음
	static Excercise getInstance(){
		// 객체에 주소가 들어옴
		return singleton; // 정적메소드에서 정적 필드만 사용가능 그래서 변수앞에 static 붙어야됨
	}
}
