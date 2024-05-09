package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {
		// 자동형변환
		byte b1 = 20; // 1Byte
		short s1 = b1; // 2Byte -부터
		
		int int1 = b1; // 4Byte
		int1 = s1; // short >  int
		
		char ch1 = '김'; // 2Byte 유니코드 이용 0 부터 글자하나만 넣을수 있음
		int inch = ch1; // 자료형이 char이면 유니코드 출력 아니면 문자 출력
		System.out.println("'김'의 유니코드 : " + inch);
		System.out.println(ch1);
		
		// 고정 소수점으로 나눔
		// 4Byte > 8Byte
		double d1 = int1;  
		System.out.println(d1);
		d1 = s1+1; // 2Byte > 8Byte
		System.out.println(d1);
		d1 = b1+2;
		System.out.println(d1);
	}
}