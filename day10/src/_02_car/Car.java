package _02_car;

public class Car extends AmbulanceCar {

	// 속성 :
	// model
	// company
	// power
	// speed

	// 생성자 : 모든 매개변수를 받는 생성자

	// 메소드
	// 시동켜고 , 끄기
	// 속도 올리고 내리고
	String model;
	String company;
	boolean power;
	int speed;

	Car(String model, String company) {
		super(model, company);
	}

	Car(boolean power, int speed) {
		super(power, speed);
	}

	// 시동 켜기
	void powerOn(boolean power) {
		if (power) {
			power = !power;
			System.out.println("시동이 켜집니다");
		}

	}

	// 시동 끄기
	void powerOff(boolean power) {
		if (!power) {
			power = !power;
			System.out.println("시동이 꺼집니다");
		}
	}

	// 속도 올리기
	void speedUp(int speed) {
		speed = +5;
		System.out.println("나 : " + speed);
	}

	// 속도 내리기
	void speedDown(int speed) {
		speed = -5;
		System.out.println("나 : " + speed);
	}

}
