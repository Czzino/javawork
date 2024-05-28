package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {

		// 전화번호
		// 그룹핑 0~9 까지의 문자 갯수{3개 ~ 4개} 
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-2340-6789";

		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}

		// 이메일 체크
		// 문자나 숫자 1개 이상 @ 문자나 숫자 . 문자
		// 문자나 숫자 1개 이상 @ 문자나 숫자 . 문자 . 문자
		// w+는 1개 이상 w는 0개이상
		// ^표시는 알파벳이나 숫자로시작 + 는 한글자 이상 @표시 \\w+ 숫자나 문자
		// (co.kr com)
		regExp = "^[a-zA-z]\\w+@\\w+.\\.\\w+(\\.\\w+)";
		data = "angle@naver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}
	}

}
