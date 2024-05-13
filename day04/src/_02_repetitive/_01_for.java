package _02_repetitive;

public class _01_for {

	public static void main(String[] args) {
		/*
		 * // 반복문
		 반복문 3가지 : for, while, do-while
		 특정한 규칙이 있는 것들을 반복하여 사용할 때	  
		 */
		
		/*
		 * // for(초기화; 조건식; 증감식){
				실행문					
			}
		 */
		for(int i=1; i<=10; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println("------------------------------");
		
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + ". 안녕하세요");
		}
		System.out.println("------------------------------");
		
		// i값 만큼 증가
		for(int i=1; i<=9; i+=5) {
			System.out.println(i + "번출력");
		}
		System.out.println("------------------------------");
		
		// 감소
		for(int i=10; i>=0; i--) {
			System.out.println(i + ". 1식 감소");
		}
		
		// 1 ~ 100 까지 합계 구하기
		// 지역변수, for문안에 넣으면 스택을 계속만들어서 지역변수를 써서 덮어쓰기로 사용
		// for문이 끝날떄 스택에 i, sum 저장공간 스택이 사라짐
		int sum = 0;
		// int i;
		for(int i=1; 1<=100; i++) {
			//sum = sum + i;
			sum += i;	
		}
		
	}

}
