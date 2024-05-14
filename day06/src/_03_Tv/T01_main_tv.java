package _03_Tv;

public class T01_main_tv {

	public static void main(String[] args) {
	
		Math.random();
		
		T01_api_tv tv1 = new T01_api_tv();
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println(tv1.inch + "인치");
		
		// void함수라 출력할수 없음
		tv1.power();
//		System.out.println("tv켜기 : " + tv1.power);
		
		// 채널업
		tv1.channerlUp();
		System.out.println("현재 채널 : " + tv1.channerlUp());
		System.out.println("현재 채널 : " + tv1.channerlUp());
		System.out.println("현재 채널 : " + tv1.channerDown());
	
		// 볼륨 
		System.out.println(tv1.volume(12));
		tv1.power(); // not
//		System.out.println("tv상태 : " + tv1.power);
	
	}
	
	
	
	
	
	
}
