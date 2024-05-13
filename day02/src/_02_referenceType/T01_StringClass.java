package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		// String 주소가 같은지 확인
		String name = "홍길동"; // 주소값 1 스택 맨밑에 name , 그위에 hobby 힘안에 객체를 따로 생성
		String hobby = "공부하기"; // 주소값 2
		
		// 주소값이 같이 않아서 false
		System.out.println(name == hobby); // false
		
		// 같은값이 들어있어서 프로그램 내부에서 알아서 주소를 같게 설정
		String str1 = "의료용";
		String str2 = "의료용";
		System.out.println("주소가 같은가? : " + (str1 == str2));

		// 같은 데이터 값이 있으면 주소가 같아서 값이 true
		String myName = "홍길동";
		System.out.println("주소가 같은가? : " + (name == myName));
		
		// new 객체 생성은 저장공간을 따로 둬서 다른곳에 저장
		String str3 = new String("영상");
		String str4 = new String("영상");
		System.out.println("주소가 같은가? : " + (str3 == str4));
		
		// 주소값이 다르지만 값을 비교해서 같은지 확인
		System.out.println("값이 같은가?" + str3.equals(str4));
		
	
	}

}
