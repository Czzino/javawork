package _02_repetitive;

public class T07_ex02 {

	public static void main(String[] args) {
		// book p111
		// 1.
		int sum = 0; // for문에서 더한값을 출력하기위해 변수 사용
		// for(초기화; 조건식; 증감식){
		// 실행문					
	    // }
		// i 5부터 100까지 i + 5 = 5
		// 5 부터 100까지 5씩 증가
		for(int i=5; i<=100; i+=5) {
			// sum + i = i; 5 10 15 20 25 30 40 50 ~ 100
			sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);
		
		// 1.2
		sum = 0;
		for(int i=5; i<=100; i++) {
			// i 나누기 5 = 0 했을떄 5의 배수
			if(i%5==0)
				sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);
	
		// 2. 두수를 입력받아 홀수, 짝수 구하기
		int evenSum = 0; // 홀수를 출력할 변수
		int oddSum = 0; // 짝수를 출력할 변수
		
		for(int i=1; i<=100; i++) {
			// i 나누기 2 = 0 일떄 2의 배수 출력
			if(i%2==0) {
				evenSum += i; // evenSum + i = i; 짜수일때 출력
			}else {
				oddSum += i; // oddSum + i = i; 홀수일떄 출력
			}
			
		}
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		System.out.println("------------------------------");
		
		// 3. 두수를 입력받아 짝수의 합계가 6일때만 출력
		
		for(int x=1; x<=6; x++) {
			// int x 1 ~ 6 까지 1,2,3,4,5 까지 증감 반복	
			for(int y=1; y<=6; y++) { // x가 1일떄 5번 반복
				// y 1 ~ 6 까지 1,2,3,4,5 까지 증감 반복
				if(x+y == 6)
				// x + y 두수의 합계가 6일떄만 출력
				//System.out.println("("+x+","+y+"");
				System.out.printf("(%d,%d)",x,y); // %d = x , %d = y  x,y는 출력할 데이터 변수
			}
		}
		System.out.println();

				
		// 5. 5부터 1까지 감소 
		for(int i=5; i>=1; i--) { // i = 5,4,3,2,1
			for(int j=0; j<i; j++) { // j =1,2,3,4,5
				// i = 5 , j = 0,1,2,3,4 i 가 1번돌떄 j 가 5번 실행
				System.out.print("*"); // 처음이 5번 j-- 실행해서 두번째가 4번 , j-- 실행되서 세번쨰가 3개
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		// 6
//		4			1
//		3			3
//		2			5
//		1			7
//		0			9
		
		// 감소니까 i<5
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				// 빈칸 print
				System.out.println(" ");
			}
			// for문이 끝남
			// 0 x 2 + 1 =1 1;
			for(int x=1; x<i*2+1; x++) {
			System.out.println("*");
			}
			System.out.println();
		}
		
		// 7. 주사위의눈이 합이 6이 될때까지
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6) + 1; // double형 랜덤 메소드 데이터를 *6 해서 정수형으로 변경
			System.out.println("(" + num + ")");
			if(num == 6) {	// 임의 데이터가 6이 됬을때만 break 멈춤			
				break;
			}
			count++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count);
		
	}

}
