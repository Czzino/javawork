package _01_casting;

public class T02_casting {

	public static void main(String[] args) {
		
		// 객체지향 언어에서 객체는생성하지않고 그냥 스택에만 쌓임
		System.out.println("byte 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("char 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		System.out.println("------------------------------------------");
		
		// 강제형변환은 데이터가 손실될수 있음
		int num1 = 123456;
		byte b1 = (byte)num1;
		System.out.println(b1);  
		
		
		long long1 = 111111111111123456L;
		float float1 = long1;
		System.out.println(float1);
		
		// 유니코드로 실행 char 강제 형변환
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
	}
}