package _02_constructor;

public class T01_main_tv {

	public static void main(String[] args) {
		// new 했을때 객체 생성되서 기본 생성자가 실행
		/*
		 * T01_api_tv tv = new T01_api_tv(); System.out.println();
		 * System.out.println("tv1의 채널 : " + tv.channel);
		 * 
		 * T01_api_tv tv2 = new T01_api_tv(); System.out.println("tv2의 채널 : " +
		 * tv.channel);
		 */
		
		// 객체를 만들때 매개변수를 넣어줌
//		T01_api_tv tv3 = new T01_api_tv("삼성");
//		System.out.println("tv1의 회사는 : " + tv3.company);
//		
//		T01_api_tv tv4 = new T01_api_tv("LG");
//		System.out.println("tv1의 회사는 : " + tv.company);
		
		T01_api_tv tv5 = new T01_api_tv("삼성", "FULL HD", 70);
		System.out.println(tv5.company + ", " + tv5.model);
		T01_api_tv tv6 = new T01_api_tv("울트라", "LG", 50);
		System.out.println(tv6.company + ", " + tv6.model);
		
		
	}

}
