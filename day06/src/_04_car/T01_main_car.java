package _04_car;

import _01_object.T02_api_class;

public class T01_main_car {

	public static void main(String[] args) {

		T01_api_car car = new T01_api_car();

		car.color = "검은색";
		System.out.println(car.color);
		
		car.power(); // void 함수 실행할떄마다 false에서 true 변경
		car.sppedUp(); // 초기값이 40
		System.out.println("현재 채널 : " + car.sppedUp());
		car.speedDown();
		System.out.println("다음 채널 : " + car.speedDown());
		System.out.println(car.company);
		System.out.println(car.model);
		car.company = "AI 의료영상";
		car.model = "아카데미";
		System.out.println(car.company);
		System.out.println(car.model);
		car.power();
	}

}
