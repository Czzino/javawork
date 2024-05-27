package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {

		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		System.out.println(name[1]);

		// 비트 연산자를 넣어서 사용
		String text2 = "홍길동-아무개/이순신,강감찬@이고잉";
		String[] name2 = text.split("-|/|,|@");
		System.out.println(Arrays.toString(name2));

		// split(분리문자열, 배열의 갯수)
		// 맨앞을 기준으로 index 번호를 나눔
		String[] name3 = text.split("-", 2);
		System.out.println(Arrays.toString(name3));
	}

}
