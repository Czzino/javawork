package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {

		// replace : 글자 치환
		String str = "javaprogram java awsjava dajava";
		String newStr = str.replace('j', 'i');
		System.out.println(str);
		System.out.println(newStr);

		String str2 = "javaprogram jeva awsjava dajava";
		newStr = str2.replace("java", "자바");
		System.out.println(newStr);

		// replaceAll
		newStr = str2.replaceAll("java", "자바");
		System.out.println(newStr);
		
		// replaceFirst
		// 맨앞 글자만 바꿈
		newStr = str.replaceFirst("java", "자바");
		System.out.println(newStr);
		
	}

}
