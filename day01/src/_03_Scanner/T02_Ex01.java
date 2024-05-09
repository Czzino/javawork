package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 출력하세요
		Scanner scans = new Scanner(System.in);
	
		System.out.print("국어 점수를 입력해주세요 : ");
		int korean = scans.nextInt();
		System.out.println("당신의 국어점수는 : " + korean);
		
		System.out.print("컴퓨터 점수를 입력해주세요 : ");
		int computer = scans.nextInt();
		System.out.println("당신의 컴퓨터점수는 : " + computer);
		
		System.out.print("수학 점수를 입력해주세요 : ");
		int math = scans.nextInt();
		System.out.println("당신의 수학점수는 : " + math);
		
		int total = korean+computer+math;
		float avg=total/3.0f;
		System.out.println("당신의 총점은 : " + total);
		System.out.println("당신의 평균 점수는 : " + avg);
		
		// 강사님 코드 
		System.out.print("국어 점수 입력 : ");
		int kor = scans.nextInt();
		System.out.print("컴퓨터 점수 입력 : ");
		int com = scans.nextInt();
		System.out.print("수학 점수 입력 : ");
		int maths = scans.nextInt();
		
		int sum = kor + com + maths;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double)sum/(double)3);
		
	}

}
