package _01_langPackage;

public class T02_hashcode {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = str1; // 주소 복사 
		
		// String클래스는 equals, hashcode를 오버라이딩 해놓은 상태
		// toString 오버라이딩 
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 원래 객체의 해시코드(고유)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
	}

}
