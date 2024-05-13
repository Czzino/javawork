package _02_repetitive;

public class T05_random {

	public static void main(String[] args) {
		
		// Math 클래스 (수학에 관련된 클래
		double random1 = Math.random();
		System.out.println(random1); // 실수형 : 0 ~ 0.99999999
		System.out.println("---------------------");
		
		// 0 ~ 9.999999999
		random1 = Math.random() * 10;
		System.out.println(random1);
		
		// double 형을 한자리수만 출력하기위해 int형으로 형변환
		int random2 = (int)random1;  // 정수로 강제 형변화 : 0 ~ 9, 1 ~ 10까지출력은 +1
		System.out.println(random2); 
		
		int random3 = (int)random1 + 1;
		System.out.println(random3);
		System.out.println("---------------------");
		
		// 0~4까지 숫자중 랜덤으로 추출
		// 4보다 큰숫자를 곱해서 출력
		// 0 ~ 0.99999 * 5 = 0 ~ 4.9999999999
		int random4 = (int)(Math.random() * 5);
		System.out.println(random4);
		
		int random5 = random4 + 1; // 1 ~ 5
		
	}

}
