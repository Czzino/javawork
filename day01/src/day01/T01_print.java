package day01;

public class T01_print {

	public static void main(String[] args) {
		// 주석 : 실행하지 않음.한줄 주석 설명이나 기타 사항들을 적는다
		/*
		  여러줄 주석
		  여러줄에 걸쳐 설명이나 특이사항들을 적을 떄 사용
		  문자를 출력할떄는 쌍따옴표 ""
		 */
		// 출력문 : println -> 출력후 줄바꿈
	    //	문자열을 출력할 때는 반드시 쌍따옴표("")를 넣어준다.
		System.out.println("더조은 컴퓨터 학원");
		System.out.println("내이름 : 천진호");
		
		// 연산은 쌍따옴표 없이 나누기는 소수점자리 생략
		System.out.println(3+7);
		System.out.println(5*3);
		
		// + 기호는 숫자였을 때는 연산을 하고
		// 문자열 이었을 때는 문자들을 연결
		System.out.println(5+3+"문자열 연결");
		System.out.println("강의실 : " + "801호");
		System.out.println("강의실 : " + " 801호");
		
		// 문자 + 숫자연산은 문자로 인식 + - 믄지열로 인식
		System.out.println("연산결과 : " +  7+9);
		
		// 문자열 뒤에 + 기호로 넣어주고 뒤에는 숫자로 인식해주고 싪을 때는 괄호()를 써준다
		System.out.println("연산결과 : " + (5+8));
		
		
		System.out.println("연산결과 곱하기: " + (5*8));
		System.out.println("연산결과 나누기 : " + (5/8));
		
		// print는 줋바꿈 안한
		System.out.print("줄바꿈 안함, ");
		System.out.print("이제 줄바꾼 안됨,");
		
		System.out.println("줄바꿈함 ");
		
		System.out.println("내이름 : 천진호");
		System.out.println("나의 장점은 : 성실함 입니다.");
	}

}
