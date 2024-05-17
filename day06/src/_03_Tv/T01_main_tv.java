package _03_Tv;

public class T01_main_tv {

	public static void main(String[] args) {

		T01_api_tv tv1 = new T01_api_tv(); // 객체 생성 후 변수 사용
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println(tv1.inch + "인치");

		// void 함수라 출력할수 없음
		// boolean power =  tv1.power; // 변수를 의미함
		
		tv1.power();

		// 채널업
		tv1.channerlUp();
		System.out.println("현재 채널 : " + tv1.channerlUp());
		System.out.println("현재 채널 : " + tv1.channerlUp());
		System.out.println("현재 채널 : " + tv1.channerDown());

		// 볼륨
		System.out.println(tv1.volume(12));
		tv1.power(); // not

	}

}
