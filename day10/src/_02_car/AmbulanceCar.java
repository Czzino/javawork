package _02_car;

public class AmbulanceCar {
	// 사이렌 울리기
	// 응급처치
	boolean power;
	int speed;
	String model;
	String company;

	int siren;
	int emer;
	
	AmbulanceCar(boolean power, int speed) {
		this.power = power;
		this.speed = speed;
	}

	AmbulanceCar(String company, String model) {
		this.company = company;
		this.model = model;
	}

	void Emergency() {
		if(power || speed == 10) {
			System.out.println("응급처치");
		}
	}
}
