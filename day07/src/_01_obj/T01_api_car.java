package _01_obj;

public class T01_api_car {

	// 회사명
	String company = "삼성";
	String model = "SM7";
	String color = "흰색";
	int speed; // 기본값 0
	boolean power; // 기본값 false
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("시동을 켭니다.");
		} else {
			System.out.println("시동을 끕니다.");
		}
	}
	
	// 지역 변수 전역변수를 사용하기위해 this를 사용
	int speed(int speed) {
		this.speed += speed;
		return this.speed;
	}
	
	// 매개변수가 없는 메소드는 speed는 인스턴스 변수를 의미함
	int speedDown() {
		speed -= 5;
		return speed;
	}
	
}
