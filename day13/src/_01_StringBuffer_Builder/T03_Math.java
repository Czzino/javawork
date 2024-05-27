package _01_StringBuffer_Builder;

public class T03_Math {

	public static void main(String[] args) {
		// 절대값
		System.out.println("-11의 절대값 : " + Math.abs(-11));
		System.out.println("-11.45의 절대값 : " + Math.abs(-11.45));

		// 소수점 이하 무조건 올림
		System.out.println("13.1의 올림 : " + Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " + Math.ceil(-13.1));
	
		// 소수점 이하 무조건 내림
		System.out.println("13.7의 내림 : " + Math.floor(13.7));
		System.out.println("-13.7의 내림 : " + Math.floor(-13.7));
		
		System.out.println("-----------------------------");
		
		// 가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.1));
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.7));
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.5));
		
		System.out.println("-13.1의 가까운 정수값 : " + Math.rint(-13.1));
		System.out.println("-13.1의 가까운 정수값 : " + Math.rint(-13.7));
	
		// 소수점 이하 반올림
		System.out.println("13.78의 반올림 : " + Math.round(13.1));
		System.out.println("13.78의 반올림 : " + Math.round(13.7));
		
		System.out.println("-13.78의 반올림 : " + Math.round(-13.1));
		System.out.println("-13.78의 반올림 : " + Math.round(-13.7));
		System.out.println("-----------------------------");
		
		// 두수중 큰수반환
		// 두주중 정수 실수 일떄 실수 반환
		System.out.println("7과 8중 큰숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은숫자 : " + Math.min(7, 8));
		System.out.println("7과 8중 작은숫자 : " + Math.min(7.8, 8));
		
		// 소수점 2째자리까지 얻기
		double value = 12.34567;
		double value2 = value*100;
		System.out.println(value2);
		
		// 소수점 두째자리까지 얻기
	    // 리턴값이 long , int
	    // long re = Math.round(value2); Math.round()의 반환형은 long형
		int result = (int)Math.round(value2);
		System.out.println(result);
		System.out.println(result/100);
		
		// 두수중에 한수가 double형이어서 자동 형변환
		double re = Math.round(value2);
		System.out.println(re/100);
		
		// 제곱연산 승수 구하기
		System.out.println("5의 3승 : " + (int)(Math.pow(5, 3)));
		System.out.println("1024의 2승 :" + Math.pow(1024, 2));
		
		System.out.println("------------------------------");
		
		// 제곱근 double형이니까 int형으로 형변환
		System.out.println("25의 제곱근 : " + Math.sqrt(25));
		System.out.println("------------------------------");
		
		// random
		double ran = Math.random()*100; // 0 ~ 99.999999
		double ran2 = Math.round(ran);
		System.out.println(ran2/100);

		
		double ran11 = (Math.random()*100) + 1; // 0 ~ 99.999999
		double ran12 = ran11*100;
		double ran13 = Math.round(ran12);
		System.out.println(ran13/100);
		
		System.out.println("------------------------------");
		
		
		// printf 사용하면 편리
		// Math클래스 안에 static 함수
		System.out.printf("%.2f", Math.random()*100 +1);
		
		// 거듭제곱 승수 구하기
		// long형
//		Math.pow(10, 2) = 100;
//		Math.pow(50,2) = 250;
//		Math.sin(6); 
//		Math.cos(5,6);
//		Math.sqrt(16); // 4
		
	}

}
