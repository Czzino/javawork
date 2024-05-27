package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {

		// sub string 시작 번호부터 시작
		String str = "spring aws start";
		// substring(index) : 문자열에서 index번호부터 끝까지 얻어옴
		System.out.println(str.substring(7));
		// substring(index, lastIndex) : 문자열에서 index번호 전까지 얻어옴
		// 마지막 index는 포함하지 않음
		// 7 ~ 9 까지
		System.out.println(str.substring(7, 10));

	}

}
