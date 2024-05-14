package _01_array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {

		// 사용자로부터 3사람의 국어, 수학, 컴퓨터 점수 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("국어 점수 입력 해주세요 첫번쨰 사람 : ");
//		int kor = scan.nextInt();
//		System.out.print("수학 점수 입력 해주세요 첫번쨰 사람 : ");
//		int math = scan.nextInt();
//		System.out.print("컴퓨터 점수 입력 첫번쨰 사람 : ");
//		int com = scan.nextInt();	
//		System.out.print("국어 점수 입력 해주세요 두번쨰 사람 : ");
//		int kor2 = scan.nextInt();
//		System.out.print("수학 점수  입력 해주세요 두번째 사람 : ");
//		int math2 = scan.nextInt();
//		System.out.print("컴퓨터 점수 입력 두번쨰 두번째 사람 : " );
//		int com2 = scan.nextInt();	
//		System.out.print("국어 점수 입력 해주세요 세번째 사람 : ");
//		int kor3 = scan.nextInt();	
//	    System.out.print("수학 점수 입력 해주세요 세번쨰 사람 : ");
//		int mat3 = scan.nextInt();		
//		System.out.print("컴퓨터 점수 입력 해주세요 세번쨰 사랑 : ");
//		int com3 = scan.nextInt();		
//		
//		int total = kor+math+com;
//		double svg = total/3;
//		System.out.println("번호" + " " + "국어" + " " + "수학" + " " + "총점" + " " + "평균");
//		System.out.println("-----------------------------------");
//		System.out.println("1." + " " + kor + " " + math + " " + com + " " + total + " " + svg);
//		System.out.println("2." + " " + kor + " " + math + " " + com + " " + total + " " + svg);
//		System.out.println("3." + " " + kor + " " + math + " " + com + " " + total + " " + svg);
		// 번호 국어 수학 컴퓨터 총점 평균
		// ---------------------------------------------
		// 1. 90 100 100 290 96.67
		// 2. 90 100 90 280 95.00
		// 3. 90 80 100 279 90.00

		// ---------------------------------------------
		// 총점 270 , 280 , 290
		// 평균 90 , 93.33 , 97.55
		
		// 강사님 코드
		int score [][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
//		System.out.println(1 + "첫번쨰 학생 국어, 수학, 컴퓨터 점수 입력 : "); // 50 60 70
//		score[0][0] = scan.next();
//		score[0][1] = scan.next();
//		score[0][2] = scan.next();
//		
//		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		System.out.println(2 + "두번째 학생 국어, 수학, 컴퓨터 점수 입력 : "); // 50 60 70
//		score[0][0] = scan.next();
//		score[1][1] = scan.next();
//		score[1][2] = scan.next();
//		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
		
		// 앞에서 i + 1 했을떄 괄호 해도 되고 안해도 되고
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + ".번째 학생 국어, 수학, 컴퓨터 점수 입력 : "); // 50 60 70
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
				// System.out.print(score[i][j] + ", "); 출력문은 확인용
			}
		
		}
//		int sum = 0;
//		sum += score[0][0]
//		sum += score[0][1]
//		sum += score[0][2]
		
		// 첫번쨰사람 이후 두번쨰 사람은 sum = 0 으로 초기화
		System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
		System.out.println("----------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + "\t");
		    int sum = 0; // 기존에있던 sum이 없어지고 다시 초기화
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]); // 1 번쨰 할상의 총점이 들어있음
				sum += score[i][j];
			}
			System.out.print(sum+ "\t");
			// System.out.println((double)sum/score[i].length);
			System.out.printf("%.2f\n", (double)sum/score[i].length);
			
		} 
		// double 로 형변환 하지않으면 소수점 이하 12번째 자리까지 나옴
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
