package _02_StringMethod;

public class T11_lower_upperCase {

	public static void main(String[] args) {
	
		// 대문자를 소문자로 바꾸는 기능
		String upper = "JAVA PROGRAM";
		String lower = upper.toLowerCase(); // 대문자를 소문자로
		System.out.println(lower);
		System.out.println(lower.toUpperCase()); // 소문자를 대문자로
	}

}
