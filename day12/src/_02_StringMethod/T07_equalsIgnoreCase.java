package _02_StringMethod;

public class T07_equalsIgnoreCase {

	public static void main(String[] args) {
		
		// equals : 대소문자를 가림
		String str = "hello";
		System.out.println(str.equals("Hellow"));
		// equalsIgnoreCase : 대소문자를 가리지 않음
		System.out.println(str.equalsIgnoreCase("Hello"));
		
	}

}
