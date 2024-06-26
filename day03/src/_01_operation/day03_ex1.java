package _01_operation;

import java.util.Scanner;

public class day03_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		// 2. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		// 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		// 3.키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		// 4. 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		// 5. 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		// 6. 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
		// 성인(19세 초과)인지 출력하세요.
		// 7. 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		// 8. 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요
		// 9. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요.
		// (단, num1은 num2보다 작아야 함
		// 10. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		Scanner scan = new Scanner(System.in);
		int num1 = 8;		
		System.out.print("양수를 입력하세요 : ");
		num1 = scan.nextInt();	
		System.out.println("" + (num1 < 0 ? "양수가 아니다" : "양수다"));
		System.out.println("" + (num1 == 0 ? "0이다" : "음수다"));
		System.out.println("" + (num1 % 2 == 1 ? "홀수" : "짝수"));  
		
		System.out.print("인원수를 입력해주세요 : ");
		int num2 = scan.nextInt();
		System.out.print("사탕개수를 입력해주세요 : ");
		int num3 = scan.nextInt();
		System.out.println("인원수" + num2 );
		System.out.println("사탕개수" + num3 );
		System.out.println("" + (num2 %= num3));
		
		System.out.print("당신의 성별은 무엇입니까?");
	    char gender3 = scan.next().charAt(0);
		System.out.println("" + (gender3 == 'M' ? "남학생" : "여학생"));
	  
		// 문자열을 숫자형으로 받아
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이 : " + age);
		
		String re4 = 
		age <= 13 ? "어린이" : 
		age <= 19 ? "청소년" : 
		age > 19 ? "성인": "";
		System.out.println(re4);
		
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = scan.nextInt();
		System.out.println(kor);
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = scan.nextInt();	
		System.out.println(eng);
		System.out.print("수학 점수를 입력해주세요 : ");
		int math = scan.nextInt();
		System.out.println(math);
		
		int total = kor + eng + math;
		System.out.println("합계 점수 : " + total);
		int avg = total /= 3;
		System.out.println("평균 점수 : " + avg);
			
		String re5 = 
		total >= 120 ? "합격" : 
		avg >= 60 ? "합격": "불합격";
		System.out.println(re5);
			
		// 1. 
		System.out.print("주민번호를 입력해주세요 : ");
		char cha = scan.next().charAt(6);
		char num = cha;
		System.out.println("" + (num == '1' ? "남자" : "여자"));
		
		System.out.print("점수를 입력해주세요 : ");
		num1 = scan.nextInt();
		System.out.print("점수를 입력해주세요 : ");
		num2 = scan.nextInt();	
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("" + (num1 < num2 ? "true" : "false"));
		
		System.out.print("점수를 입력해주세요 : ");
		num1 = scan.nextInt();
		System.out.print("점수를 입력해주세요 : ");
		num2 = scan.nextInt();
		System.out.print("점수를 입력해주세요 : ");
		num3 = scan.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	
		if(num1 == num2) {
			if(num2 == num3) {
				System.out.println("true");
			}
		} else {
			System.out.println("false");
		}
	}

}
